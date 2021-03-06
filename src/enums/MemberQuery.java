package enums;

public enum MemberQuery {
	LOGIN,INSERT_MEMBER,COUNT_MEMBER,UPDATE,DELETE, SELECT_ALL, SELECT_SOME, SELECT_ONE;
	
	@Override
	public String toString() {
		
		String query ="";
		switch(this) {
		case LOGIN :
			query="SELECT MEM_ID USERID,TEAM_ID TEAMID,NAME,"
					+ "SSN,ROLL,PASSWORD FROM MEMBER "
					+ "WHERE MEM_ID LIKE '%s'"
					+ "AND PASSWORD LIKE '%s'";
			break;
		case INSERT_MEMBER:
			query="INSERT INTO MEMBER(MEM_ID,NAME,PASSWORD,SSN,AGE)"
					+ "VALUES('%s','%s','%s','%s','%s')";
			break;
		case COUNT_MEMBER:
			query="SELECT COUNT(*) AS COUNT FROM MEMBER";
			break;
		case UPDATE:
			query="UPDATE MEMBER SET PASSWORD = '%s'" + 
					" WHERE PASSWORD LIKE '%s'" + 
					"AND MEM_ID LIKE '%s'";
			break;
		case DELETE :
			query ="DELETE FROM MEMBER" + 
					" WHERE MEM_ID LIKE '%s'" + 
					"AND PASSWORD LIKE '%s'";
			break;
		case SELECT_ALL : 
			query="SELECT" + 
					" MEM_ID USERID," + 
					" TEAM_ID TEAMID," + 
					" NAME," + 
					" AGE," + 
					" ROLL," + 
					" PASSWORD," + 
					" SSN" + 
					" FROM MEMBER";
			break;
		case SELECT_SOME:
			query ="SELECT" + 
					"    MEM_ID USERID," + 
					"    TEAM_ID TEAMID," + 
					"    NAME," + 
					"    AGE," + 
					"    ROLL," + 
					"    PASSWORD," + 
					"    SSN" + 
					" FROM MEMBER" + 
					" WHERE TEAM_ID LIKE '%s'";
			break;
		case SELECT_ONE:
			query ="SELECT" + 
					"    MEM_ID USERID," + 
					"    TEAM_ID TEAMID," + 
					"    NAME," + 
					"    AGE," + 
					"    ROLL," + 
					"    PASSWORD," + 
					"    SSN" + 
					" FROM MEMBER" + 
					" WHERE MEM_ID LIKE '%s'";
			break;
		}
	
		return query;
	}
	
}
