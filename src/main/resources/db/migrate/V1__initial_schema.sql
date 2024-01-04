CREATE TABLE account (
	id integer not null,
  accounttype VARCHAR(255) NOT NULL,
  accountid VARCHAR(255) NOT NULL,
  clientid VARCHAR(255) NOT NULL,
  balance DECIMAL(10,2) NOT NULL,
  withdrawallowed BOOLEAN NOT NULL,
  Constraint pk_account primary key (id)
);