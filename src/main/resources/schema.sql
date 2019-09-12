CREATE TABLE continents
(
    id    VARCHAR(2) PRIMARY KEY,
    label VARCHAR(64) NOT NULL
);

CREATE TABLE languages
(
    id   VARCHAR(2) PRIMARY KEY,
    name VARCHAR(256) NOT NULL,
    native VARCHAR(256) NOT NULL
);

CREATE TABLE countries
(
    id   VARCHAR(2) PRIMARY KEY,
    name VARCHAR(256) NOT NULL,
    native VARCHAR(256) NOT NULL,
    phone VARCHAR(256) NOT NULL,
    continent VARCHAR(2) NOT NULL,
    capital VARCHAR(256) NOT NULL,
    currencies VARCHAR(256) NOT NULL,
    area VARCHAR(32),
    FOREIGN KEY (continent) references continents(id)
);

CREATE TABLE countries_languages
(
    country_id   VARCHAR(2) NOT NULL,
    language_id   VARCHAR(2) NOT NULL,
    PRIMARY KEY (country_id, language_id),
    FOREIGN KEY (country_id) references countries(id),
    FOREIGN KEY (language_id) references languages(id)
);