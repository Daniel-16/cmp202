#!/bin/bash

folder_path="/home/dan-codes/Documents/cmp202"

cd "$folder_path" || exit

git add .

echo "Enter a commit message"

read commit_message

git commit -m "$commit_message"

echo "Enter a branch name"

read branch_name

git push origin $branch_name
