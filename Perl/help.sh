#!/bin/bash

for I in {202..210}
do
    echo $I.pl
    cp $1.pl $I.pl
done
