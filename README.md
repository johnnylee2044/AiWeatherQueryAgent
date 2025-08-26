This is a backend project that allow you to establish the connection with Gemini by provding the API key.

There are two ways to return the message from LLM to frontend, one return as String, which is sending all text at once.  Another one is Flux<String>, which will return line by line.

The SystemMessage in the interface allow you to assigned the role for LLM, in this case, it is a weather query agent.
