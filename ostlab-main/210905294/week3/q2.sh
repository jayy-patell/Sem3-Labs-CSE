echo "Enter number of odd nums to print: "
read n


for ans in 1 2 3 4 5
    do 
        x = `expr $ans % 2`
        if [ $x -ne 0 ]
        then
            echo $ans
        fi
done