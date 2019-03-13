function koniec()
{

    swal({
        title: "Grzyby jakie zebrales ",

        text: "Grzyby jadalne "+Widok.Jadalne + " Grzyby trujace: "+Widok.Trujace,
    })



}



new Image().src = "/images/board.png";
new Image().src = "/images/ground.png";
new Image().src = "/images/ground.png";
new Image().src = "/images/ground.png";
new Image().src = "/images/ground.png";
new Image().src = "/images/ground.png";
new Image().src = "/images/ground.png";
new Image().src = "/images/ground.png";
new Image().src = "/images/ground.png";
new Image().src = "/images/ground.png";
new Image().src = "/images/ground.png";
new Image().src = "/images/ground.png";
new Image().src = "/images/ground.png";
new Image().src = "/images/ground.png";
new Image().src = "/images/ground.png";
new Image().src = "/images/ground.png";
new Image().src = "/images/ground.png";
new Image().src = "/images/ground.png";
new Image().src = "/images/ground.png";
new Image().src = "/images/ground.png";
new Image().src = "/images/ground.png";
new Image().src = "/images/ground.png";
new Image().src = "/images/ground.png";





var Widok =
    {
        ile:0,
        Punkty: 0,
        Trujace: 0,
        Jadalne:0,
        ilosc: 0,
        DisplayGrzyb(Pole)
        {
            var pole = document.getElementById(Pole);
            cell.setAttribute("class", "grzyb"+i);
        }
    };

var Egzeplarz1 =
    {
        Grzyb : [
            {
                Pole:0,
                Status: false,
                name: "BorowikSzatanski",
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "BorowikSzatanski");

                    pole.onclick=function () {
                        return Zabierz(Pole,"BorowikSzatanski")
                            ;}
                }
            },
            {
                Pole:0,
                Status: false,
                name: "koslarz",
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "koslarz");

                    pole.onclick=function () { return Zabierz(Pole,"koslarz");}
                }
            },
            {
                Pole:0,
                Status: true,
                name: "BorowikSzlachetny",

                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "BorowikSzlachetny");

                    pole.onclick=function () { return Zabierz(Pole,"BorowikSzlachetny");}
                }
            },
            {
                Pole:0,
                Status: true,
                name: "BorowikSosnowy",
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "BorowikSosnowy");

                    pole.onclick=function () { return Zabierz(Pole,"BorowikSosnowy");}
                }
            }


        ]

    };
var Egzeplarz2 =
    {
        Grzyb : [
            {
                Pole:0,
                Status: false,
                name:"GolabekWymiotny",
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);

                    pole.setAttribute("class", "GolabekWymiotny");

                    pole.onclick=function () { return Zabierz(Pole,"GolabekWymiotny");}


                }
            },
            {
                Pole:0,
                Status: true,
                name:"GolabekBlotny",
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "GolabekBlotny");

                    pole.onclick=function () { return Zabierz(Pole,"GolabekBlotny");}
                }
            },
            {
                Pole:0,
                Status: false,
                name:"MuchomorZielonawy",
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "MuchomorZielonawy");

                    pole.onclick=function () { return Zabierz(Pole,"MuchomorZielonawy");}
                }
            },
            {
                Pole:0,
                Status: true,
                name:"KozlarzCzerwony",
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "KozlarzCzerwony");

                    pole.onclick=function () { return Zabierz(Pole,"KozlarzCzerwony");}
                }
            }


        ]

    };
var Egzeplarz3 =
    {
        Grzyb : [
            {
                Pole:0,
                Status: true,
                name: "PieczarkaDwuzarodnikowa",
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "PieczarkaDwuzarodnikowa");

                    pole.onclick=function () { return Zabierz(Pole,"PieczarkaDwuzarodnikowa");}
                }
            },
            {
                Pole:0,
                Status: true,
                name: "TwardnikJaponski",
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "TwardnikJaponski");

                    pole.onclick=function () { return Zabierz(Pole,"TwardnikJaponski");}
                }
            },
            {
                Pole:0,
                Status: false,
                name: "MuchomorPlanisty",
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "MuchomorPlanisty");

                    pole.onclick=function () { return Zabierz(Pole,"MuchomorPlanisty");}
                }
            },
            {
                Pole:0,
                Status: false,
                name: "HelmowkaObrzezona",
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "HelmowkaObrzezona");

                    pole.onclick=function () { return Zabierz(Pole,"HelmowkaObrzezona");}
                }
            }


        ]

    };
var Egzeplarz4 =
    {
        Grzyb : [
            {
                Pole:0,
                Status: false,
                name: "StrzepiakCeglasty",
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "StrzepiakCeglasty");

                    pole.onclick=function () { return Zabierz(Pole,"StrzepiakCeglasty");}

                }
            },
            {
                Pole:0,
                Status: false,
                name: "LejkowkaJadowita",
                DisplayGrzyb: function(Pole,i)

                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "LejkowkaJadowita");

                    pole.onclick=function () { return Zabierz(Pole,"LejkowkaJadowita");}

                }
            },
            {
                Pole:0,
                Status: true,
                name: "PieprznikJadalny",
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "PieprznikJadalny");

                    pole.onclick=function () { return Zabierz(Pole,"PieprznikJadalny");}

                }
            },
            {
                Pole:0,
                Status: true,
                name: "BoczniakMikolajkowy",
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "BoczniakMikolajkowy");

                    pole.onclick=function () { return Zabierz(Pole,"BoczniakMikolajkowy");}
                }
            }


        ]

    };
function Zabierz(pole,name)
{  var pole2;
    var ile=0;

    for(var i=0; i<8; i++)
    {
        if(Grzybek.Grzyb[i].Pole == pole)
        {
            if(Grzybek.Grzyb[i].Status==false)
            {
                pole2 = "x";
                Grzybek.Grzyb[i].Pole = pole2;
                Widok.Trujace++;
            }
            else (Grzybek.Grzyb[i].Status==true)
            {
                pole2 = "x";
                Grzybek.Grzyb[i].Pole = pole2;

                Widok.Jadalne++;
            }
            var div = document.getElementById(pole);
            var time=setInterval(function(){  div.setAttribute("class", "z"+ile);
                ile++;
                if(ile==3)
                {


                    clearInterval(time);
                    div.removeAttribute('class', name);

                } },50);
        }
    }





}
var Grzybek =
    {   ile:0,
        Grzyb : [
            {

            },

            {

            },

            {

            },
            {

            },
            {

            },
            {

            },
            {

            },
            {


            }

        ]
    };
function init()
{
    swal({
        icon : "/resources/static/images/Witaj.png",
        title: "Witaj!",
        text: "Znadz jak najwiecej grzybów jadalnych!"

    })
    GeneratorGrzybow();
    Lokacje();
    for(var i=0; i<8; i++)
    {   var Pole = Grzybek.Grzyb[i].Pole;
        Grzybek.Grzyb[i].DisplayGrzyb(Pole,i)
    }

}
function GeneratorGrzybow()
{ var grzyb;
    for(var i=0; i<2; i++)
    {
        var indeks = Math.floor(Math.random() * 4);
        Grzybek.Grzyb[Grzybek.ile].Pole = Egzeplarz1.Grzyb[indeks].Pole;
        Grzybek.Grzyb[Grzybek.ile].DisplayGrzyb = Egzeplarz1.Grzyb[indeks].DisplayGrzyb;
        Grzybek.Grzyb[Grzybek.ile].Status = Egzeplarz1.Grzyb[indeks].Status;
        Grzybek.Grzyb[Grzybek.ile].name = Egzeplarz1.Grzyb[indeks].name;
        Grzybek.ile++;
        indeks = Math.floor(Math.random() * 4);
        Grzybek.Grzyb[Grzybek.ile].Pole = Egzeplarz2.Grzyb[indeks].Pole;
        Grzybek.Grzyb[Grzybek.ile].DisplayGrzyb = Egzeplarz2.Grzyb[indeks].DisplayGrzyb;
        Grzybek.Grzyb[Grzybek.ile].Status = Egzeplarz2.Grzyb[indeks].Status;
        Grzybek.Grzyb[Grzybek.ile].name = Egzeplarz2.Grzyb[indeks].name;
        Grzybek.ile++;
        indeks = Math.floor(Math.random() * 4);
        Grzybek.Grzyb[Grzybek.ile].Pole = Egzeplarz3.Grzyb[indeks].Pole;
        Grzybek.Grzyb[Grzybek.ile].DisplayGrzyb = Egzeplarz3.Grzyb[indeks].DisplayGrzyb;
        Grzybek.Grzyb[Grzybek.ile].Status = Egzeplarz3.Grzyb[indeks].Status;
        Grzybek.Grzyb[Grzybek.ile].name = Egzeplarz3.Grzyb[indeks].name;
        Grzybek.ile++;
        indeks = Math.floor(Math.random() * 4);
        Grzybek.Grzyb[Grzybek.ile].Pole = Egzeplarz4.Grzyb[indeks].Pole;
        Grzybek.Grzyb[Grzybek.ile].DisplayGrzyb = Egzeplarz4.Grzyb[indeks].DisplayGrzyb;
        Grzybek.Grzyb[Grzybek.ile].Status = Egzeplarz4.Grzyb[indeks].Status;
        Grzybek.Grzyb[Grzybek.ile].name = Egzeplarz4.Grzyb[indeks].name;


        Grzybek.ile++;
    }
}
var time=0;
function reset()
{
    setTimeout(function(){
        var mins = Math.floor(time/10/60);
        var secs = Math.floor(time/10);
        var tenths = time % 10;
        time++;
        document.getElementById("timer").innerHTML = mins+":"+secs+":"+tenths;
        if(secs==4)
        {


            GeneratorGrzybow();
            Lokacje();
            for(var i=0; i<8; i++)
            {   var Pole = Grzybek.Grzyb[i].Pole;
                Grzybek.Grzyb[i].DisplayGrzyb(Pole,i)
            }

        }
        reset();

    },100);
}

function Lokacje()
{ var row;


    do
    {  var kontener = [];

        for(var i=0; i<8; i++)
        {
            row = Math.floor(Math.random() * 48);
            kontener.push(row);


        }
    }while(!Kolizja(kontener))
    for(var j=0; j<8; j++)
    {
        Grzybek.Grzyb[j].Pole=kontener[j];

    }





}


function Kolizja(grzyb)
{ var schowek;


    for(var i=0; i<8; i++)
    {   var ile=0;

        schowek=grzyb[i];

        for(var j=0; j<8; j++)
        {
            if(grzyb[j]==schowek)
            {
                ile++;
            }
            if(ile==2)
            {   ile--;
                grzyb.splice(j,1);
            }



        }

    }
    if(grzyb.length==8)
    {
        return true;
    }else
    {
        return false;
    }

}
window.onload = init;