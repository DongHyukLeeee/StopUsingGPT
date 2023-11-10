
SET autocommit = true;

-- 데이터베이스 만들기
DROP DATABASE IF EXISTS ssafit;
CREATE DATABASE IF NOT EXISTS ssafit;

-- 만든 데이터베이스 사용할 것임
USE ssafit;

-- 영상 테이블 만들기(PK: youtube_id)
CREATE TABLE IF NOT EXISTS `video`(
	youtube_id VARCHAR(20) CHARACTER SET utf8mb4 NOT NULL PRIMARY KEY,
    channel_name VARCHAR(30) CHARACTER SET utf8mb4 NOT NULL,
	view_cnt INT DEFAULT 0,
	fit_part_name VARCHAR(10) CHARACTER SET utf8mb4 NOT NULL,
    title VARCHAR(50) CHARACTER SET utf8mb4 NOT NULL);
   
-- 데이터 넣기
INSERT INTO video(youtube_id,channel_name,fit_part_name,title)
VALUES
	("swRNeYw1JkY", "ThankyouBUBU", "전신", "하루 15분! 전신 칼로리 불태우는 다이어트 운동"),
		("gMaB-fG4u4g", "힙으뜸", "전신", "살 빠지는 전신운동 루틴 "),
		("54tTYO-vU2E", "ThankyouBUBU", "상체", "상체 다이어트 최고의 운동 BEST [팔뚝살/겨드랑이살/등살/가슴어깨라인]"),
		("QqqZH3j_vH0", "ThankyouBUBU", "상체", "상체비만 다이어트 최고의 운동 [상체 핵매운맛]"),
		("tzN6ypk6Sps", "김강민", "하체", "하체운동이 중요한 이유? 이것만 보고 따라하자 ! [하체운동 교과서]"),
		("u5OgcZdNbMo", "GYM종국", "하체", "저는 하체 식주의자 입니다"),
		("PjGcOP-TQPE", "ThankyouBUBU", "복부", "11자복근 복부 최고의 운동 [복근 핵매운맛]"),
		("7TLk7pscICk", "SomiFit", "복부", "(Sub)누워서하는 5분 복부운동!! 효과보장! (매일 2주만 해보세요!)");
	
-- 회원 테이블 만들기
CREATE TABLE IF NOT EXISTS `user`(
nickname VARCHAR(40) CHARACTER SET utf8mb4 NOT NULL PRIMARY KEY,
id VARCHAR(40) CHARACTER SET utf8mb4 NOT NULL,
pw VARCHAR(52) CHARACTER SET utf8mb4 NOT NULL
);


INSERT INTO `user`(nickname, id, pw)
VALUES
("김싸피","ssafy","1234");




-- 리뷰 테이블 만들기
CREATE TABLE `review` (
    id INT AUTO_INCREMENT PRIMARY KEY,
    video_review_id INT DEFAULT 1,
    title VARCHAR(50) CHARACTER SET utf8mb4 NOT NULL,
    writer VARCHAR(40) CHARACTER SET utf8mb4 NOT NULL,
    reg_date TIMESTAMP DEFAULT NOW(),
    view_cnt INT DEFAULT 0,
    youtube_id VARCHAR(20) CHARACTER SET utf8mb4 NOT NULL,
    content TEXT CHARACTER SET utf8mb4,
    
    CONSTRAINT `fk_youtube_id` 
		FOREIGN KEY (`youtube_id`) 
		REFERENCES `video` (`youtube_id`) 
		ON UPDATE CASCADE 
        ON DELETE CASCADE
);

SELECT * FROM review;
SELECT * FROM user;
SELECT * FROM user WHERE id = 'ssafy' AND pw = 1234;