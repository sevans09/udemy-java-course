packageutilities;

public class CSV {

	// This function will read data from a CSV file and return as a list
	public List<String[]> void read(String file) {

		List<String[]> data = new LinkedList<String[]>();
		String dataRow = br.readLine();
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			while (dataRow = br.readLine() != null) {
				String[] dataRecords = dataRow.split(",");
				data.add(dataRecords);
			}
		} catch (FileNotFoundException e) {
			System.out.println("COULD NOT FIND FILE");
			e.printStackTrace();	
		} catch (IOException e) {
			System.out.println("COULD NOT READ FILE");
			e.printStackTrace;
		}
		return data;

	}


}
