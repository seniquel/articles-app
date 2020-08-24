cd articles-back
mvn clean package -Dmaven.test.skip
cd ..\articles-front
npm run build -- --prod
cd ..
docker-compose up --build
