package kr.co.bitcamp.enums;

public enum Sql {
	CREATE_DB, 
	CREATE_PERSONS, DROP_PERSONS, TRUNCATE_PERSONS,
	CREATE_ARTICLES, DROP_ARTICLES, TRUNCATE_ARTICLES,
	CREATE_FILES, DROP_FILES, TRUNCATE_FILES;
	@Override
	public String toString() {
		String result = "";
		switch(this) {
		case CREATE_DB:
			result = "create database mariadb";
			break;
		case CREATE_PERSONS:
			result = "create table persons(userid varchar(30)primary key,"+ 
                    " password varchar(30) ," +
                    " username varchar(30) ," +
                    " birthday varchar(30) ," +
                    " gender varchar(10) ," +
                    " regdate varchar(10) ," +
                    " telephone varchar(30))ENGINE=InnoDB DEFAULT CHARSET=UTF8" ;
			break;
		case DROP_PERSONS:
			result = "drop table persons";
			break;
		
		case TRUNCATE_PERSONS:
			result = "truncate table persons";
			break;
		case TRUNCATE_ARTICLES :
			result = "truncate table articles";
			break;
		case CREATE_ARTICLES:
           result =  "create table articles("
                   + "article_number int auto_increment primary key,"
                   + "file_number int  references files,"
                   + "userid varchar(30)  references persons,"
                   + "comment varchar(500),"
                   + "message varchar(50),"
                   + "rating varchar(50), "
                   + "boardtype varchar(50),"
                   + "title varchar(300),"
                   + "content varchar(1000))ENGINE=InnoDB DEFAULT CHARSET=UTF8";
			break;
		case DROP_ARTICLES:
			result = "drop table articles";
			break;
		case CREATE_FILES:
	           result =  "create table files("+
	                   "file_number int auto_increment primary key"+
	                   "file_name varchar(100)"+
	                    ")ENGINE=InnoDB DEFAULT CHARSET=UTF8";
				break;
		case TRUNCATE_FILES :
			result = "truncate table files";
			break;
		case DROP_FILES:
			result = "drop table files";
			break;
		default:
			break;
		}
		return result;
	}
}
