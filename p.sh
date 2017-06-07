#!bin/bash
echo "CMD: $1"
ssh-agent bash -c "ssh-add ~/.ssh/selFrame; $1"
