FROM openjdk:8-jre-alpine3.9

ENV SERVICE_PORTS=8090

RUN mkdir -p /app/

WORKDIR /app

COPY ./entrypoint.sh /app/
RUN chmod 755 -R /app/

COPY ./demo*.jar /app/

ENTRYPOINT ["/app/entrypoint.sh"]