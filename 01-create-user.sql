DO $$BEGIN
    IF EXISTS (SELECT 1 FROM pg_catalog.pg_user WHERE usename = 'springstudent') THEN
        DROP USER springstudent;
    END IF;
END$$;

CREATE USER springstudent WITH PASSWORD '18231337';

ALTER USER springstudent WITH SUPERUSER;

GRANT ALL PRIVILEGES ON DATABASE student TO springstudent;

