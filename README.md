# ictlab.llc-backend
Backend for ictlab.llc built with Spring Boot and PostgreSQL.

## Setup
1. Install Java 17 and Maven.
2. Configure PostgreSQL with `ictlab_db` and user `ictlab_user` (password: `123nimda`).
3. Run `mvn clean package -DskipTests`.
4. Start with `java -jar target/backend-0.0.1-SNAPSHOT.jar`.

## API Endpoints
- `GET /api/public/events` - List all events.
- `POST /api/admin/events` - Create an event (admin only).
- `POST /api/public/feedback` - Submit feedback.
