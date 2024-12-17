FROM postgres:16

# Copy the SQL file into the initialization directory
COPY init.sql /docker-entrypoint-initdb.d/

# Set environment variables for PostgreSQL configuration
ENV POSTGRES_DB=company
ENV POSTGRES_USER=random
ENV POSTGRES_PASSWORD=code

# It's a good practice to ensure the database is initialized only when the container is first created
# to avoid unnecessary re-execution of the SQL scripts
