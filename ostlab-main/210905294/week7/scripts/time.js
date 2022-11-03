function showTime(){
    const date = new Date();
    var hrs = date.getHours();
    var mins = date.getMinutes();
    var sec = date.getSeconds();
    var am_pm = "AM";

    if (hrs > 12) {
        hrs -= 12;
        am_pm = "PM";
    }
    if (hrs == 0) {
        hrs = 12;
        am_pm = "AM";
    }

    const time = hrs+":"+mins+":"+sec+" "+am_pm; 
    document.getElementById("clock").innerHTML="DYNAMIC CLOCK : "+time;

    const t = setTimeout(function() {
        showTime();
    },1000);
}
    showTime();
    

    // setInterval(showTime,1000);

