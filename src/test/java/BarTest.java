import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarTest {

    Guest guest;
    Guest guest1;
    Guest guest2;
    Bar bar;

    @Before
    public void before(){
        guest = new Guest("Annabel", 703);
        guest1 = new Guest("Jonny", 17);
        guest2 = new Guest("Fraser", 25);
        bar = new Bar(10, "Ten Forward");
    }

    @Test
    public void hasCapacity(){
      assertEquals(10, bar.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("Ten Forward", bar.getName());
    }

    @Test
    public void startsWithNoPatrons(){
        assertEquals(0, bar.getPatronsNumber());
    }

    @Test
    public void hasAgeRequirement(){
        assertEquals(18, bar.getAgeRequirement());
    }

    @Test
    public void canCheckAgeNotOK(){
        assertEquals(false, bar.isOldEnough(guest1));
    }

    @Test
    public void canCheckAgeOK(){
        assertEquals(true, bar.isOldEnough(guest));
    }

    @Test
    public void hasSpaceInBar(){
        assertEquals(true, bar.hasEnoughSpace());
    }

    @Test
    public void hasNoSpaceInBar(){
        Bar barFull = new Bar(0, "Zero Forward");
        assertEquals(false, barFull.hasEnoughSpace());
    }

    @Test
    public void addAGuest(){
        bar.addPatron(guest);
        assertEquals(1, bar.getPatronsNumber());
    }

    @Test
    public void clearTheBar(){
        bar.closeBar();
        assertEquals(0, bar.getPatronsNumber());
    }

    @Test
    public void removeAGuest(){
        bar.addPatron(guest);
        bar.addPatron(guest2);
        bar.removePatron(guest2);
        assertEquals(1, bar.getPatronsNumber());
        assertEquals(false, bar.isPatronInBar(guest2));
    }

    @Test
    public void removeGuestNotThere(){
        bar.addPatron(guest);
        bar.removePatron(guest2);
        assertEquals(1, bar.getPatronsNumber());
        assertEquals(true, bar.isPatronInBar(guest));
    }

//    @Test
//    public void sellDrink(){
//
//        assertEquals(10, );
//    }

}




