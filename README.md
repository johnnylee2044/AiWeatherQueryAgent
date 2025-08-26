Weather Query Agent

A sophisticated Spring Boot-based backend service that leverages LangChain4j and Google's Gemini AI to provide intelligent weather query responses through natural language processing. Features both standard and streaming API endpoints.

🚀 Features
AI-Powered Weather Queries: Utilizes Google's Gemini large language model to understand and process natural language weather requests

Dual Response Modes: Support for both standard string responses and streaming Flux responses

RESTful API: Clean API endpoints for seamless integration with frontend applications

Spring Boot Framework: Built on robust enterprise-grade Java framework

LangChain4j Integration: Implements advanced AI chain patterns for structured LLM interactions

Reactive Streaming: Supports Server-Sent Events (SSE) for real-time response streaming




🛠️ Tech Stack
Backend Framework: Spring Boot 3.x (WebFlux for streaming support)

AI Integration: LangChain4j

LLM Provider: Google Gemini API

Language: Java 17+

Build Tool: Maven/Gradle

Reactive Programming: Project Reactor (Flux)





📋 Prerequisites
Java 17 or higher

Maven 3.6+ or Gradle 7+

Google Gemini API key

Spring Boot 3.x





⚙️ Configuration
1.Clone the repository:

git clone <your-repository-url>
cd weather-query-agent

2.Set up Gemini API credentials:
Add your Google Gemini API key to application.properties:

gemini.api.key=your_gemini_api_key_here
gemini.model.name=gemini_model name

(You can get your API key from ai studio, and every account should have free tier for daily limited usage)




/chat: Simple string response for basic integrations

/chatStream: Real-time streaming for better user experience



