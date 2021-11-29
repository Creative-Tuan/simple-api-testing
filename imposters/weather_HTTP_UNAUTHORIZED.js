(request, state, logger) => {
    return {
        statusCode: 401, headers: {'Content-Type': 'application/json;charset=UTF-8'}, body: {
            "cod": 401, "message": "Invalid API key. Please see http://openweathermap.org/faq#error401 for more info."
        }
    }
}