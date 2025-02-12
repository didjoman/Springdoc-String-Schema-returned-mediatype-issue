# Springdoc-String-Schema-returned-mediatype-issue

The Open Api Specification generated (schema for response 200OK is of type String instead of being a ref to the Response schema and the response schema is missing):
```json
{
  "openapi": "3.1.0",
  "info": {
    "title": "OpenAPI definition",
    "version": "v0"
  },
  "servers": [
    {
      "url": "http://localhost:8080",
      "description": "Generated server url"
    }
  ],
  "paths": {
    "/test": {
      "get": {
        "tags": [
          "basic-controller"
        ],
        "summary": "get",
        "description": "Provides a response.",
        "operationId": "get",
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "application/hal+json": {
                "schema": {
                  "type": "string"
                }
              }
            }
          }
        }
      }
    }
  },
  "components": {
    "schemas": {
      "Link": {
        "type": "object",
        "properties": {
          "href": {
            "type": "string"
          },
          "hreflang": {
            "type": "string"
          },
          "title": {
            "type": "string"
          },
          "type": {
            "type": "string"
          },
          "deprecation": {
            "type": "string"
          },
          "profile": {
            "type": "string"
          },
          "name": {
            "type": "string"
          },
          "templated": {
            "type": "boolean"
          }
        }
      },
      "Links": {
        "type": "object",
        "additionalProperties": {
          "$ref": "#/components/schemas/Link"
        }
      }
    }
  }
}
```