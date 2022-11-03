echo "Enter a number: "
read n

x=`expr $n % 2`
if [ $x = 0 ]
then
    echo "Even"
else
    echo "Odd"
fi