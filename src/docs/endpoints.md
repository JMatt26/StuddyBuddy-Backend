# Endpoints

### Method: POST

### /session/createSession

### Request Body:

```json
{
  "sessionId": "sessionId"
}
```
### Method: PUT
### `/session/joinSession`
### Request Param:

```json
{
  "userId":"userId"
}
```

### Response Body:

```json
{
  "Success":"Status 200",
  "FailureNoAuth":"Status 401",
  "FailureNotFound":"Status 400"
}
```

### Method: GET
### `/session/getSessionsByTopic`
### Request Param:

```json
{
  "sessionTopic":"sessionTopic"
}
```
### Response Body:
```json
{
  "sessionList": [
    {
      "sessionId": "sessionId",
      "numberOfParticipants": "numberOfParticipants",
      "capacity": "capacity",
      "topic":"topic",
      "description":"description",
      "time":"time",
      "location":"location",
      "duration":"duration",
      "isPrivate":"isPrivate",
      "isOnline":"isOnline",
      "tags":"tags"
    }],
  "Success":"Status 200",
  "FailureNotFound":"Status 400"
}
```

### Method: GET
### `/session/getSessionsByTags`
### Request Param:

```json
{
  "tags":"tags"
}
```
### Response Body:
```json
{
  "sessionList": [
    {
      "sessionId": "sessionId",
      "numberOfParticipants": "numberOfParticipants",
      "capacity": "capacity",
      "topic":"topic",
      "description":"description",
      "time":"time",
      "location":"location",
      "duration":"duration",
      "isPrivate":"isPrivate",
      "isOnline":"isOnline",
      "tags":"tags"
    }],
  "Success":"Status 200",
  "FailureNotFound":"Status 400"
}
```

### Method: GET
### `/session/getSessionsByUsername`
### Request Param:

```json
{
  "username":"username"
}
```
### Response Body:
```json
{
  "sessionList": [
    {
      "sessionId": "sessionId",
      "numberOfParticipants": "numberOfParticipants",
      "capacity": "capacity",
      "topic":"topic",
      "description":"description",
      "time":"time",
      "location":"location",
      "duration":"duration",
      "isPrivate":"isPrivate",
      "isOnline":"isOnline",
      "tags":"tags"
    }],
  "Success":"Status 200",
  "FailureNotFound":"Status 400"
}
```

### Method: GET
### `/session/getActiveSessions`
### Request Param:

```json
{
  "NA":"NA"
}
```
### Response Body:
```json
{
  "sessionList": [
    {
      "sessionId": "sessionId",
      "numberOfParticipants": "numberOfParticipants",
      "capacity": "capacity",
      "topic":"topic",
      "description":"description",
      "time":"time",
      "location":"location",
      "duration":"duration",
      "isPrivate":"isPrivate",
      "isOnline":"isOnline",
      "tags":"tags"
    }],
  "Success":"Status 200",
  "FailureNotFound":"Status 400"
}
```

### Method: GET
### `/session/getUpcomingSessions`
### Request Param:

```json
{
  "NA":"NA"
}
```
### Response Body:
```json
{
  "sessionList": [
    {
      "sessionId": "sessionId",
      "numberOfParticipants": "numberOfParticipants",
      "capacity": "capacity",
      "topic":"topic",
      "description":"description",
      "time":"time",
      "location":"location",
      "duration":"duration",
      "isPrivate":"isPrivate",
      "isOnline":"isOnline",
      "tags":"tags"
    }],
  "Success":"Status 200",
  "FailureNotFound":"Status 400"
}
```