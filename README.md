# 

### Postman tests
// get all tasks
* Get: http://localhost:8080/getAllTask

// create task
* Post: http://localhost:8080/saveTask
* Body:
{
"title" : "task1",
"description" : "description",
"owner" : "thabang",
"start_date" : "start_date",
"end_date" : "end_date",
"status" : "done",
"priority" : "critical",
"comment" : "review done",
"col_width" : [1,2,3,5]
}