import static org.junit.jupiter.api.Assertions.*;

class IpConvrTest {

    @org.junit.jupiter.api.Test
    void TestBig() {
        var converter=new int32toIP4Converter();
        assertEquals("128.114.17.104",converter.longToIP(2154959208L));
    }
    @org.junit.jupiter.api.Test
    void TestZero() {
        var converter=new int32toIP4Converter();
        assertEquals("0.0.0.0",converter.longToIP(0));
    }

    @org.junit.jupiter.api.Test
    void TestSmall() {
        var converter=new int32toIP4Converter();
        assertEquals("0.0.0.254",converter.longToIP(254));
    }

}