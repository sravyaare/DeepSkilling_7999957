$(document).ready(function(){

    // Handle Register Button Click
    $('#registerBtn').click(function(){

        $('#message').text(
            'Registration Successful!'
        );

    });

    // Fade Out Event Card
    $('#hideBtn').click(function(){

        $('#eventCard').fadeOut(1000);

    });

    // Fade In Event Card
    $('#showBtn').click(function(){

        $('#eventCard').fadeIn(1000);

    });

});