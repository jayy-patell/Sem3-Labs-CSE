echo "Enter a b c"
read a
read b
read c

disc=$(((b*b)-4*a*c))
echo "Discriminant is $disc"

if [ $disc -gt 1 ]
    then
    var="1"
elif [ $disc -eq 0 ]
    then
    var="0"
else
    var="-1"
fi

case $var in
    "0")
    echo "Roots are equal and real"
    root=$((-b / 2*a))
    echo $root
    ;;
    "1")
    echo "Roots are distint and real"
    root1=$(( (-b-disc)/(2*a) ))
    root2=$(( (-b+disc)/(2*a) ))
    echo $root1
    echo $root2
    ;;
    "-1")
    echo "Roots are imaginanry"
    ;;
esac