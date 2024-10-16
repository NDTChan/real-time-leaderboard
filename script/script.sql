CREATE TABLE users
(
    user_id       INT AUTO_INCREMENT PRIMARY KEY,
    username      VARCHAR(50) UNIQUE  NOT NULL,
    password_hash VARCHAR(255)        NOT NULL,
    email         VARCHAR(100) UNIQUE NOT NULL,
    created_at    DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE games
(
    game_id     INT AUTO_INCREMENT PRIMARY KEY,
    game_name   VARCHAR(100) UNIQUE NOT NULL,
    description VARCHAR(255)
);

CREATE TABLE scores
(
    score_id   INT AUTO_INCREMENT PRIMARY KEY,
    user_id    INT NOT NULL,
    game_id    INT NOT NULL,
    score      INT NOT NULL,
    score_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users (user_id) ON DELETE CASCADE,
    FOREIGN KEY (game_id) REFERENCES games (game_id) ON DELETE CASCADE
);

CREATE VIEW global_leaderboard AS
SELECT u.username,
       g.game_name,
       MAX(s.score) AS top_score
FROM scores s
         JOIN
     users u ON s.user_id = u.user_id
         JOIN
     games g ON s.game_id = g.game_id
GROUP BY s.user_id, s.game_id
ORDER BY top_score DESC;

CREATE VIEW user_rankings AS
SELECT u.user_id,
       u.username,
       RANK() OVER (ORDER BY MAX(s.score) DESC) AS user_rank
FROM
    scores s
JOIN
    users u ON s.user_id = u.user_id
GROUP BY
    u.user_id;

CREATE VIEW top_players_report AS
SELECT u.username,
       g.game_name,
       MAX(s.score) AS top_score,
       s.score_date
FROM scores s
         JOIN
     users u ON s.user_id = u.user_id
         JOIN
     games g ON s.game_id = g.game_id
GROUP BY u.user_id, g.game_id
ORDER BY top_score DESC;