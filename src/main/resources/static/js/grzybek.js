var Widok =
    {
        DisplayGrzyb(Pole)
        {
            var pole = document.getElementById(Pole);
            cell.setAttribute("class", "grzyb"+i);
        }
    }

var Egzeplarz1 =
    {
        Grzyb : [
            {
                Pole:0,
                Status: false,
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "BorowikSzatanski");
                }
            },
            {
                Pole:0,
                Status: false,
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "koslarz");
                }
            },
            {
                Pole:0,
                Status: true,
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "BorowikSzlachetny");
                }
            },
            {
                Pole:0,
                Status: true,
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "BorowikSosnowy");
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
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "GolabekWymiotny");
                }
            },
            {
                Pole:0,
                Status: true,
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "GolabekBlotny");
                }
            },
            {
                Pole:0,
                Status: false,
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "MuchomorZielonawy");
                }
            },
            {
                Pole:0,
                Status: true,
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "KozlarzCzerwony");
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
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "PieczarkaDwuzarodnikowa");
                }
            },
            {
                Pole:0,
                Status: true,
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "TwardnikJaponski");
                }
            },
            {
                Pole:0,
                Status: false,
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "MuchomorPlanisty");
                }
            },
            {
                Pole:0,
                Status: false,
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "HelmowkaObrzezona");
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
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "StrzepiakCeglasty");
                }
            },
            {
                Pole:0,
                Status: false,
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "LejkowkaJadowita");
                }
            },
            {
                Pole:0,
                Status: true,
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "PieprznikJadalny");
                }
            },
            {
                Pole:0,
                Status: true,
                DisplayGrzyb: function(Pole,i)
                {
                    var pole = document.getElementById(Pole);
                    pole.setAttribute("class", "BoczniakMikolajkowy");
                }
            }


        ]

    };
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
        indeks = Math.floor(Math.random() * 4);
        Grzybek.Grzyb[Grzybek.ile].Pole = Egzeplarz1.Grzyb[indeks].Pole;
        Grzybek.Grzyb[Grzybek.ile].DisplayGrzyb = Egzeplarz1.Grzyb[indeks].DisplayGrzyb;
        Grzybek.Grzyb[Grzybek.ile].Status = Egzeplarz1.Grzyb[indeks].Status;
        Grzybek.ile++;
        indeks = Math.floor(Math.random() * 4);
        Grzybek.Grzyb[Grzybek.ile].Pole = Egzeplarz2.Grzyb[indeks].Pole;
        Grzybek.Grzyb[Grzybek.ile].DisplayGrzyb = Egzeplarz2.Grzyb[indeks].DisplayGrzyb;
        Grzybek.Grzyb[Grzybek.ile].Status = Egzeplarz2.Grzyb[indeks].Status;
        Grzybek.ile++;
        indeks = Math.floor(Math.random() * 4);
        Grzybek.Grzyb[Grzybek.ile].Pole = Egzeplarz3.Grzyb[indeks].Pole;
        Grzybek.Grzyb[Grzybek.ile].DisplayGrzyb = Egzeplarz3.Grzyb[indeks].DisplayGrzyb;
        Grzybek.Grzyb[Grzybek.ile].Status = Egzeplarz3.Grzyb[indeks].Status;
        Grzybek.ile++;
        indeks = Math.floor(Math.random() * 4);
        Grzybek.Grzyb[Grzybek.ile].Pole = Egzeplarz4.Grzyb[indeks].Pole;
        Grzybek.Grzyb[Grzybek.ile].DisplayGrzyb = Egzeplarz4.Grzyb[indeks].DisplayGrzyb;
        Grzybek.Grzyb[Grzybek.ile].Status = Egzeplarz4.Grzyb[indeks].Status;
        Grzybek.ile++;
    }
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