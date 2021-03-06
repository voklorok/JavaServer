package base;

import org.junit.Assert;
import org.junit.Test;

public class LongIdTest extends Assert {

    @Test
    public void toStringTest() {
        LongId<Object> id1 = new LongId<Object>(1);

        assertTrue("1".equals(id1.toString()));
    }

    @Test
	public void hashCodeTest() {
		Long testValue = new Long(1);
		LongId<Object> id1 = new LongId<Object>(testValue);

		assertEquals(id1.hashCode(), testValue.hashCode());
	}

    @Test
     public void equalsTest() {
        LongId<Object> id1 = new LongId<Object>(2);
        LongId<Object> id2 = new LongId<Object>(1);
        LongId<Object> id3 = new LongId<Object>(2);

        assertTrue(id1 != id2);
        assertFalse(id1.equals(id2));
        assertTrue(id1.equals(id3));

        assertFalse(id1.equals(new Object()));
    }

    @Test
    public void getTest() {
        LongId<Object> id = new LongId<Object>(1);
        assertEquals(id.get(), 1);
    }



}
