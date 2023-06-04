CREATE TABLE Event
(
    id      INT AUTO_INCREMENT PRIMARY KEY,
    message VARCHAR(2048)
);

INSERT INTO event (message)
VALUES ('테스트 메세지');