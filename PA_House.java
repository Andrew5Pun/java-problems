 /*Andrew P
  * Nov 14, 2019
  * House*/
  import java.awt.*;
  import hsa.Console;
  import javax.imageio.*;
  import java.io.*;


    public class PA_House
    {
      static Console c;           // The output console

      public static Image loadImage (String name)  //Loads Images
      {
        Image img = null;
        try
        {
          img = ImageIO.read (new File (name));
        }
        catch (IOException e)
        {
          System.out.println("File not found.");
        }
        return img;
      }

      public static void scalePoly(int[] x, int[] y, int sides, double scale, int mx, int my) {//function can resize and move polygon easily

          for (int i = 0; i < x.length; i++) { //loop for each element in array x
              x[i] *= scale; //multiply the index element by scale
              x[i] += mx; //add moved x position
            }

      for (int i = 0; i < y.length; i++) { //loop for each element in array y
          y[i] *= scale; //multiply the index element by scale
          y[i] += my; //add moved y position
        }

      c.fillPolygon(x, y, sides); //fill the polygon with appropriate parameters

    }

  public static void scaleOval(int x, int y, int l, int w, double scale, int mx, int my) {//function can resize and move oval easily

      x *= scale; //multiply x by scale
      x += mx; //add moved x position
      y *= scale; //multiply y by scale
      y += my; //add moved y position
      l *= scale; //multiply length by scale
      w *= scale; //multiply width by scale

      c.fillOval(x, y, l, w); //fill oval with appropriate parameters
    }

  public static void main (String[] args)
  {
    c = new Console (40,100); // Create new console window 808 685
    int time = 40; //set time to 40
    int movey = 0; //set movement of y to 0.
    //double scale = 0.1;
    for (double scale = 0; scale <= 1; scale += 0.01) { //loop many times, increasing scale
        /*Image pic = loadImage("Dreamstime/house.jpg");
    if(pic != null) // image loaded
      c.drawImage (pic, 0, 0, null);
    */
   int movex = 0; //set movement of x to 0
   c.clear(); //clear the console each frame
    //0 roof bottom

    c.setColor (new Color (23, 24, 19));

    int x0points[] = {554, 729, 646, 502}; // x-coordinates of all points
    int y0points[] = {83, 245, 247, 96}; // y-coordinates of all points
    scalePoly(x0points, y0points, 4, scale, movex, movey);
    //1: side house
    c.setColor (new Color (219, 223, 206));

    int x1points[] = {169, 171, 334, 330}; // x-coordinates of all points
    int y1points[] = {217, 469, 580, 217}; // y-coordinates of all points
    scalePoly(x1points, y1points, 4, scale, movex, movey);


    //2: front house
    c.setColor (new Color (255, 250, 208));

    int x2points[] = {664, 652, 334, 330, 530}; // x-coordinates of all points
    int y2points[] = {224, 504, 580, 217, 94}; // y-coordinates of all points
    scalePoly(x2points, y2points, 5, scale, movex, movey);

    //4: roof left edge
    c.setColor (new Color (114, 115, 118));
    int x4points[] = {107, 116, 305, 288}; // x-coordinates of all points
    int y4points[] = {232, 247, 243, 220}; // y-coordinates of all points
    scalePoly(x4points, y4points, 4, scale, movex, movey);

    //5: roof front edge
    c.setColor (new Color (170, 162, 151));

    int x5points[] = {305, 288, 554, 725, 729, 554}; // x-coordinates of all points
    int y5points[] = {243, 220, 45, 226, 245, 83}; // y-coordinates of all points
    scalePoly(x5points, y5points, 6, scale, movex, movey);

    //3: roof top
    c.setColor (new Color (176, 176, 174));

    int x3points[] = {554, 288, 107, 308}; // x-coordinates of all points
    int y3points[] = {45, 220, 232, 113}; // y-coordinates of all points
    scalePoly(x3points, y3points, 4, scale, movex, movey);

    //6: chimney left side
    c.setColor (new Color (138, 134, 136));

    int x6points[] = {264, 264, 296, 296}; // x-coordinates of all points
    int y6points[] = {165, 84, 75, 159}; // y-coordinates of all points
    scalePoly(x6points, y6points, 4, scale, movex, movey);

    //7: chimney front side
    c.setColor (new Color (150, 142, 131));

    int x7points[] = {347, 347, 296, 296}; // x-coordinates of all points
    int y7points[] = {81, 134, 159, 75}; // y-coordinates of all points
    scalePoly(x7points, y7points, 4, scale, movex, movey);

    //8: door roof bottom
    c.setColor (new Color (33, 33, 31));

    int x8points[] = {649, 696, 648, 617}; // x-coordinates of all points
    int y8points[] = {351, 398, 389, 354}; // y-coordinates of all points
    scalePoly(x8points, y8points, 4, scale, movex, movey);

    //9: door left side
    c.setColor (new Color (153, 144, 111));

    int x9points[] = {548, 550, 588, 588}; // x-coordinates of all points
    int y9points[] = {395, 529, 540, 401}; // y-coordinates of all points
    scalePoly(x9points, y9points, 4, scale, movex, movey);

    //10: door front side
    c.setColor (new Color (223, 207, 155));

    int x10points[] = {658, 656, 588, 588, 630}; // x-coordinates of all points
    int y10points[] = {381, 520, 540, 401, 354}; // y-coordinates of all points
    scalePoly(x10points, y10points, 5, scale, movex, movey);

    //11: door red
    c.setColor (new Color (248, 0, 0));

    int x11points[] = {601, 644, 644, 601}; // x-coordinates of all points
    int y11points[] = {396, 388, 523, 535}; // y-coordinates of all points
    scalePoly(x11points, y11points, 4, scale, movex, movey);

    //30 door window
    c.setColor (new Color (208, 0, 0));

    int x30points[] = {608, 639, 639, 606}; // x-coordinates of all points
    int y30points[] = {401, 396, 456, 464}; // y-coordinates of all points
    scalePoly(x30points, y30points, 4, scale, movex, movey);

    //31 doorknob
    c.setColor (new Color (140, 122, 121));

    scaleOval(635, 461, 10, 10, scale, movex, movey);

    //32 doorknob shine
    c.setColor (new Color (255, 255, 255));

    scaleOval(638, 462, 6, 6, scale, movex, movey);


    //12: left door roof
    c.setColor (new Color (98, 98, 94));

    int x12points[] = {527, 523, 586, 594}; // x-coordinates of all points
    int y12points[] = {404, 393, 404, 415}; // y-coordinates of all points
    scalePoly(x12points, y12points, 4, scale, movex, movey);

    //13: front door roof
    c.setColor (new Color (162, 157, 149));

    int x13points[] = {703, 648, 586, 594, 649, 696}; // x-coordinates of all points
    int y13points[] = {386, 331, 404, 415, 353, 398}; // y-coordinates of all points
    scalePoly(x13points, y13points, 6, scale, movex, movey);

    //14: top door roof
    c.setColor (new Color (149, 148, 143));

    int x14points[] = {523, 586, 649, 586}; // x-coordinates of all points
    int y14points[] = {393, 404, 331, 325}; // y-coordinates of all points
    scalePoly(x14points, y14points, 4, scale, movex, movey);

    //15: left top window frame
    c.setColor (new Color (159, 150, 133));

    int x15points[] = {382, 507, 507, 382}; // x-coordinates of all points
    int y15points[] = {225, 227, 319, 323}; // y-coordinates of all points
    scalePoly(x15points, y15points, 4, scale, movex, movey);




    //16: left top window
    c.setColor (new Color (190, 182, 169));

    int x16points[] = {395, 497, 496, 395}; // x-coordinates of all points
    int y16points[] = {235, 236, 310, 316}; // y-coordinates of all points
    scalePoly(x16points, y16points, 4, scale, movex, movey);

    //17: left top window sill left
    c.setColor (new Color (149, 144, 109));

    int x17points[] = {379, 387, 386, 379}; // x-coordinates of all points
    int y17points[] = {322, 325, 336, 335}; // y-coordinates of all points
    scalePoly(x17points, y17points, 4, scale, movex, movey);

    //18: left top window sill front
    c.setColor (new Color (232, 218, 163));

    int x18points[] = {379, 387, 516, 506}; // x-coordinates of all points
    int y18points[] = {322, 325, 317, 313}; // y-coordinates of all points
    scalePoly(x18points, y18points, 4, scale, movex, movey);

    //19: left top window sill top
    c.setColor (new Color (223, 204, 150));

    int x19points[] = {386, 387, 516, 515}; // x-coordinates of all points
    int y19points[] = {336, 325, 317, 327}; // y-coordinates of all points
    scalePoly(x19points, y19points, 4, scale, movex, movey);



    //20: right window frame
    c.setColor (new Color (159, 150, 133));

    int x20points[] = {559, 621, 620, 557}; // x-coordinates of all points
    int y20points[] = {226, 228, 307, 307}; // y-coordinates of all points
    scalePoly(x20points, y20points, 4, scale, movex, movey);

    //21: right window
    c.setColor (new Color (190, 182, 169));

    int x21points[] = {568, 615, 614, 567}; // x-coordinates of all points
    int y21points[] = {233, 234, 300, 303}; // y-coordinates of all points
    scalePoly(x21points, y21points, 4, scale, movex, movey);

    //22: right top window sill left
    c.setColor (new Color (149, 144, 109));

    int x22points[] = {555, 554, 563, 562}; // x-coordinates of all points
    int y22points[] = {306, 320, 321, 309}; // y-coordinates of all points
    scalePoly(x22points, y22points, 4, scale, movex, movey);

    //23: right top window sill front
    c.setColor (new Color (223, 204, 150));

    int x23points[] = {563, 562, 629, 628}; // x-coordinates of all points
    int y23points[] = {321, 309, 305, 316}; // y-coordinates of all points
    scalePoly(x23points, y23points, 4, scale, movex, movey);

    //24: right top window sill top
    c.setColor (new Color (232, 218, 163));

    int x24points[] = {555, 562, 629, 620}; // x-coordinates of all points
    int y24points[] = {306, 309, 305, 301}; // y-coordinates of all points
    scalePoly(x24points, y24points, 4, scale, movex, movey);


    //26: bottom window frame
    c.setColor (new Color (159, 150, 133));

    int x26points[] = {382, 503, 503, 382}; // x-coordinates of all points
    int y26points[] = {388, 374, 459, 484}; // y-coordinates of all points
    scalePoly(x26points, y26points, 4, scale, movex, movey);

    //25: bottom window
    c.setColor (new Color (190, 182, 169));

    int x25points[] = {394, 494, 494, 394}; // x-coordinates of all points
    int y25points[] = {394, 382, 455, 475}; // y-coordinates of all points
    scalePoly(x25points, y25points, 4, scale, movex, movey);


    //27: bottom window sill left
    c.setColor (new Color (149, 144, 109));

    int x27points[] = {379, 387, 386, 379}; // x-coordinates of all points
    int y27points[] = {480, 486, 497, 493}; // y-coordinates of all points
    scalePoly(x27points, y27points, 4, scale, movex, movey);

    //28: bottom window sill front
    c.setColor (new Color (223, 204, 150));

    int x28points[] = {387, 386, 514, 514}; // x-coordinates of all points
    int y28points[] = {486, 497, 471, 460}; // y-coordinates of all points
    scalePoly(x28points, y28points, 4, scale, movex, movey);

    //29: bottom window sill top
    c.setColor (new Color (232, 218, 163));

    int x29points[] = {514, 387, 379, 505}; // x-coordinates of all points
    int y29points[] = {460, 486, 480, 456}; // y-coordinates of all points
    scalePoly(x29points, y29points, 4, scale, movex, movey);



    try //wait
{
    Thread.sleep(time);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}
    if (time <= 70) { //time intervals get bigger and bigger
        time ++;
    }
    }

    try //delay
{
    Thread.sleep(600);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}
    if (time <= 70) {
        time ++;
    }

    c.setColor (new Color (0, 0, 0));
    Font f = new Font ("Broadway", Font.PLAIN, 70); // font name, style, point size
    c.setFont (f);
    c.drawString ("Hello.", 210, 81); //Display message

    try //delay
{
    Thread.sleep(1500);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}

    c.drawString ("I am the house.", 181, 582); //Display message

        try //delay
{
    Thread.sleep(1000);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}

    c.drawString ("Goodbye.", 270, 651); //Display message
    double scale = 1; //set scale to 1


        try //delay
{
    Thread.sleep(2000);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}

    for (int movex = 0; movex <= 1000; movex += 75) { //loop while increasing x position to animate house going off frame
   c.clear(); //clear console each frame
    //0 roof bottom

    c.setColor (new Color (23, 24, 19));

    int x0points[] = {554, 729, 646, 502}; // x-coordinates of all points
    int y0points[] = {83, 245, 247, 96}; // y-coordinates of all points
    scalePoly(x0points, y0points, 4, scale, movex, movey);
    //1: side house
    c.setColor (new Color (219, 223, 206));

    int x1points[] = {169, 171, 334, 330}; // x-coordinates of all points
    int y1points[] = {217, 469, 580, 217}; // y-coordinates of all points
    scalePoly(x1points, y1points, 4, scale, movex, movey);


    //2: front house
    c.setColor (new Color (255, 250, 208));

    int x2points[] = {664, 652, 334, 330, 530}; // x-coordinates of all points
    int y2points[] = {224, 504, 580, 217, 94}; // y-coordinates of all points
    scalePoly(x2points, y2points, 5, scale, movex, movey);

    //4: roof left edge
    c.setColor (new Color (114, 115, 118));
    int x4points[] = {107, 116, 305, 288}; // x-coordinates of all points
    int y4points[] = {232, 247, 243, 220}; // y-coordinates of all points
    scalePoly(x4points, y4points, 4, scale, movex, movey);

    //5: roof front edge
    c.setColor (new Color (170, 162, 151));

    int x5points[] = {305, 288, 554, 725, 729, 554}; // x-coordinates of all points
    int y5points[] = {243, 220, 45, 226, 245, 83}; // y-coordinates of all points
    scalePoly(x5points, y5points, 6, scale, movex, movey);

    //3: roof top
    c.setColor (new Color (176, 176, 174));

    int x3points[] = {554, 288, 107, 308}; // x-coordinates of all points
    int y3points[] = {45, 220, 232, 113}; // y-coordinates of all points
    scalePoly(x3points, y3points, 4, scale, movex, movey);

    //6: chimney left side
    c.setColor (new Color (138, 134, 136));

    int x6points[] = {264, 264, 296, 296}; // x-coordinates of all points
    int y6points[] = {165, 84, 75, 159}; // y-coordinates of all points
    scalePoly(x6points, y6points, 4, scale, movex, movey);

    //7: chimney front side
    c.setColor (new Color (150, 142, 131));

    int x7points[] = {347, 347, 296, 296}; // x-coordinates of all points
    int y7points[] = {81, 134, 159, 75}; // y-coordinates of all points
    scalePoly(x7points, y7points, 4, scale, movex, movey);

    //8: door roof bottom
    c.setColor (new Color (33, 33, 31));

    int x8points[] = {649, 696, 648, 617}; // x-coordinates of all points
    int y8points[] = {351, 398, 389, 354}; // y-coordinates of all points
    scalePoly(x8points, y8points, 4, scale, movex, movey);

    //9: door left side
    c.setColor (new Color (153, 144, 111));

    int x9points[] = {548, 550, 588, 588}; // x-coordinates of all points
    int y9points[] = {395, 529, 540, 401}; // y-coordinates of all points
    scalePoly(x9points, y9points, 4, scale, movex, movey);

    //10: door front side
    c.setColor (new Color (223, 207, 155));

    int x10points[] = {658, 656, 588, 588, 630}; // x-coordinates of all points
    int y10points[] = {381, 520, 540, 401, 354}; // y-coordinates of all points
    scalePoly(x10points, y10points, 5, scale, movex, movey);

    //11: door red
    c.setColor (new Color (248, 0, 0));

    int x11points[] = {601, 644, 644, 601}; // x-coordinates of all points
    int y11points[] = {396, 388, 523, 535}; // y-coordinates of all points
    scalePoly(x11points, y11points, 4, scale, movex, movey);

    //30 door window
    c.setColor (new Color (208, 0, 0));

    int x30points[] = {608, 639, 639, 606}; // x-coordinates of all points
    int y30points[] = {401, 396, 456, 464}; // y-coordinates of all points
    scalePoly(x30points, y30points, 4, scale, movex, movey);

    //31 doorknob
    c.setColor (new Color (140, 122, 121));

    scaleOval(635, 461, 10, 10, scale, movex, movey);

    //32 doorknob shine
    c.setColor (new Color (255, 255, 255));

    scaleOval(638, 462, 6, 6, scale, movex, movey);


    //12: left door roof
    c.setColor (new Color (98, 98, 94));

    int x12points[] = {527, 523, 586, 594}; // x-coordinates of all points
    int y12points[] = {404, 393, 404, 415}; // y-coordinates of all points
    scalePoly(x12points, y12points, 4, scale, movex, movey);

    //13: front door roof
    c.setColor (new Color (162, 157, 149));

    int x13points[] = {703, 648, 586, 594, 649, 696}; // x-coordinates of all points
    int y13points[] = {386, 331, 404, 415, 353, 398}; // y-coordinates of all points
    scalePoly(x13points, y13points, 6, scale, movex, movey);

    //14: top door roof
    c.setColor (new Color (149, 148, 143));

    int x14points[] = {523, 586, 649, 586}; // x-coordinates of all points
    int y14points[] = {393, 404, 331, 325}; // y-coordinates of all points
    scalePoly(x14points, y14points, 4, scale, movex, movey);

    //15: left top window frame
    c.setColor (new Color (159, 150, 133));

    int x15points[] = {382, 507, 507, 382}; // x-coordinates of all points
    int y15points[] = {225, 227, 319, 323}; // y-coordinates of all points
    scalePoly(x15points, y15points, 4, scale, movex, movey);




    //16: left top window
    c.setColor (new Color (190, 182, 169));

    int x16points[] = {395, 497, 496, 395}; // x-coordinates of all points
    int y16points[] = {235, 236, 310, 316}; // y-coordinates of all points
    scalePoly(x16points, y16points, 4, scale, movex, movey);

    //17: left top window sill left
    c.setColor (new Color (149, 144, 109));

    int x17points[] = {379, 387, 386, 379}; // x-coordinates of all points
    int y17points[] = {322, 325, 336, 335}; // y-coordinates of all points
    scalePoly(x17points, y17points, 4, scale, movex, movey);

    //18: left top window sill front
    c.setColor (new Color (232, 218, 163));

    int x18points[] = {379, 387, 516, 506}; // x-coordinates of all points
    int y18points[] = {322, 325, 317, 313}; // y-coordinates of all points
    scalePoly(x18points, y18points, 4, scale, movex, movey);

    //19: left top window sill top
    c.setColor (new Color (223, 204, 150));

    int x19points[] = {386, 387, 516, 515}; // x-coordinates of all points
    int y19points[] = {336, 325, 317, 327}; // y-coordinates of all points
    scalePoly(x19points, y19points, 4, scale, movex, movey);



    //20: right window frame
    c.setColor (new Color (159, 150, 133));

    int x20points[] = {559, 621, 620, 557}; // x-coordinates of all points
    int y20points[] = {226, 228, 307, 307}; // y-coordinates of all points
    scalePoly(x20points, y20points, 4, scale, movex, movey);

    //21: right window
    c.setColor (new Color (190, 182, 169));

    int x21points[] = {568, 615, 614, 567}; // x-coordinates of all points
    int y21points[] = {233, 234, 300, 303}; // y-coordinates of all points
    scalePoly(x21points, y21points, 4, scale, movex, movey);

    //22: right top window sill left
    c.setColor (new Color (149, 144, 109));

    int x22points[] = {555, 554, 563, 562}; // x-coordinates of all points
    int y22points[] = {306, 320, 321, 309}; // y-coordinates of all points
    scalePoly(x22points, y22points, 4, scale, movex, movey);

    //23: right top window sill front
    c.setColor (new Color (223, 204, 150));

    int x23points[] = {563, 562, 629, 628}; // x-coordinates of all points
    int y23points[] = {321, 309, 305, 316}; // y-coordinates of all points
    scalePoly(x23points, y23points, 4, scale, movex, movey);

    //24: right top window sill top
    c.setColor (new Color (232, 218, 163));

    int x24points[] = {555, 562, 629, 620}; // x-coordinates of all points
    int y24points[] = {306, 309, 305, 301}; // y-coordinates of all points
    scalePoly(x24points, y24points, 4, scale, movex, movey);


    //26: bottom window frame
    c.setColor (new Color (159, 150, 133));

    int x26points[] = {382, 503, 503, 382}; // x-coordinates of all points
    int y26points[] = {388, 374, 459, 484}; // y-coordinates of all points
    scalePoly(x26points, y26points, 4, scale, movex, movey);

    //25: bottom window
    c.setColor (new Color (190, 182, 169));

    int x25points[] = {394, 494, 494, 394}; // x-coordinates of all points
    int y25points[] = {394, 382, 455, 475}; // y-coordinates of all points
    scalePoly(x25points, y25points, 4, scale, movex, movey);


    //27: bottom window sill left
    c.setColor (new Color (149, 144, 109));

    int x27points[] = {379, 387, 386, 379}; // x-coordinates of all points
    int y27points[] = {480, 486, 497, 493}; // y-coordinates of all points
    scalePoly(x27points, y27points, 4, scale, movex, movey);

    //28: bottom window sill front
    c.setColor (new Color (223, 204, 150));

    int x28points[] = {387, 386, 514, 514}; // x-coordinates of all points
    int y28points[] = {486, 497, 471, 460}; // y-coordinates of all points
    scalePoly(x28points, y28points, 4, scale, movex, movey);

    //29: bottom window sill top
    c.setColor (new Color (232, 218, 163));

    int x29points[] = {514, 387, 379, 505}; // x-coordinates of all points
    int y29points[] = {460, 486, 480, 456}; // y-coordinates of all points
    scalePoly(x29points, y29points, 4, scale, movex, movey);



    try //delay
{
    Thread.sleep(time);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}
    if (time <= 70) { //time intervals decrease more and more each loop
        time --;
    }
    }

  } // main method
} // CopyOfPA_House class
