--SensorId | year | month of the year | week of the year | day of the year | DayMetrics Json
--CREATE TABLE metrics (
--  sensorId bigint NOT NULL,
--  year smallint NOT NULL,
--  month smallint NOT NULL,
--  week smallint  NOT NULL,
--  day smallint NOT NULL,
--  metrics json NOT NULL
--);

--ALTER TABLE metrics ADD CONSTRAINT unique_metrics_per_day UNIQUE(sensorId, year, month, week, day);

--CREATE INDEX day_metrics_index ON metrics (sensorId, year, day);
--CREATE INDEX month_metrics_index ON metrics (sensorId, year, month);
--CREATE INDEX week_metrics_index ON metrics (sensorId, year, week);