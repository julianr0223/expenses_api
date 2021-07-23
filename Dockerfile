FROM gradle

WORKDIR /app

COPY . .

RUN ./gradlew clean

CMD ["./gradlew", "build"]

#-------------------------------------------------------------
FROM openjdk:11

EXPOSE 8080

ADD build/libs/BankAccount-0.0.1-SNAPSHOT.jar bank-account.jar

ENTRYPOINT [ "java", "-jar", "bank-account.jar" ]