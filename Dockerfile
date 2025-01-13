# 1. Base Image 설정 (OpenJDK 17 사용)
FROM openjdk:17-jdk-slim

# 2. 작업 디렉토리 생성
WORKDIR /app

# 3. JAR 파일 복사 (빌드된 JAR 파일을 Docker 이미지에 추가)
COPY build/libs/*.jar app.jar

# 4. 실행 명령어 설정
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
