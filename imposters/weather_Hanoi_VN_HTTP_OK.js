(request, state, logger) => {
    return {
        statusCode: 200, headers: {'Content-Type': 'application/json;charset=UTF-8'}, body: {
            "coord": {
                "lon": 105.8412, "lat": 21.0245
            }, "weather": [{
                "id": 800, "main": "Clear", "description": "clear sky", "icon": "01d"
            }], "base": "stations", "main": {
                "temp": 294.15,
                "feels_like": 293.38,
                "temp_min": 294.15,
                "temp_max": 294.15,
                "pressure": 1019,
                "humidity": 41,
                "sea_level": 1019,
                "grnd_level": 1017
            }, "visibility": 10000, "wind": {
                "speed": 4.03, "deg": 7, "gust": 4.33
            }, "clouds": {
                "all": 9
            }, "dt": 1637736809, "sys": {
                "type": 1, "id": 9308, "country": "VN", "sunrise": 1637709163, "sunset": 1637748852
            }, "timezone": 25200, "id": 1581130, "name": "Hanoi", "cod": 200
        }
    }
}