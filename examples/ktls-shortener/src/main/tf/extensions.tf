resource "aws_dynamodb_table" "basic-dynamodb-table" {
  name           = "short-url-table"
  billing_mode   = "PROVISIONED"
  read_capacity  = 20
  write_capacity = 20
  hash_key       = "URLHash"

  attribute {
    name = "URLHash"
    type = "S"
  }
}
