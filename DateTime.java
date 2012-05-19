public class DateTime extends DateClass
{
		private int time;
		private int hour;
		private int minute;
		private boolean am;

		public DateTime()
		{
			super();
			time = 1200;
		}

		public DateTime(DateClass inDateClass, int inHour, int inMinute)
		{
			super(inDateClass);
			time = validTime(inHour, inMinute);
		}

		public DateTime(DateTime inDateTime)
		{
			super(inDateTime);
			time = inDateTime.getTime();
		}

		public void setTime(int inHour, int inMinute)
		{
			validTime(inHour, inMinute);
		}

		public int getTime()
		{
			return time;
		}

		public String toString()
		{
			return new String(time + super.toString());
		}

		public String toCSV()
		{
			return new String (time + ", " + super.toCSV());
		}

		public boolean equals(DateTime inDateTime)
		{
			return ( super.equals(inDateTime) && time == inDateTime.getTime());
		}

		public int validTime(int inHour, int inMinute)
		{
			if ( (inHour > 0) && (inHour <= 23) && (inMinute <=59) && (inMinute > 0) )
			{
				hour = inHour;
				minute = inMinute;
			}
			time = (hour * 1000 + minute);
			return time;
		}


}