package Observer_2;

public class WeatherStation_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Đầu tiên, tạo đối tượng WeatherData (đây là Subject)
        WeatherData weatherData = new WeatherData();

        // Tạo ba màn hình hiển thị và truyền đối tượng weatherData vào
        // (Bên trong constructor của mỗi Display, chúng sẽ tự đăng ký với Subject)
        CurrentConditionsDisplay currentDisplay = 
            new CurrentConditionsDisplay(weatherData);
   //     StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
   //     ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        // Mô phỏng việc có dữ liệu thời tiết mới gửi về từ trạm khí tượng
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

	}

}
