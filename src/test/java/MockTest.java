import org.junit.Test;
import org.junit.runner.RunWith;
import org.lewickiy.Cat;
import org.lewickiy.CatDog;
import org.lewickiy.Dog;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MockTest {
    @Mock
    private Cat cat;
    @Mock
    private Dog dog;

    @Test
    public void test() {
        Cat halfCat = cat.createHalfCat();
        Dog halfDog = dog.createHalfDog();
        verify(cat, times(1)).createHalfCat();
        verify(dog, times(1)).createHalfDog();
    }

    @Test
    public void test2() {
        when(cat.createHalfCat()).thenReturn(new Cat(2, "Я самый умный"));
        when(dog.createHalfDog()).thenReturn(new Dog(2, "Я самый весёлый"));
        Cat halfCat = cat.createHalfCat();
        Dog halfDog = dog.createHalfDog();
        CatDog catDog = new CatDog(halfCat, halfDog);
        assertEquals(4, catDog.getLegsCount());
        assertEquals("Единственный в мире малыш Котопёс", catDog.getSound());
    }
}
