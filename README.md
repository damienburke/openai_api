Spring OpenAI
===
This example shows how to do a basic Spring AI application in Kotlin.

Create OpenAI Key :
Log in to your ChatGPT account and create your OpenAI API key [here](https://platform.openai.com/api-keys).

Once you have an API key, set it to the
`OPENAI_API_KEY` environment variable.

```bash
export OPENAI_API_KEY=sk-...
```

```bash
curl localhost:8080/ask \
  -H"Content-type: application/json" \
  -d'{"question":"What does CIA stand for?"}'
```