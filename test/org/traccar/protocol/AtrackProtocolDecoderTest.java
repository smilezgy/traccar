package org.traccar.protocol;

import org.jboss.netty.buffer.ChannelBuffers;
import org.junit.Test;
import org.traccar.ProtocolDecoderTest;
import org.traccar.helper.ChannelBufferTools;

public class AtrackProtocolDecoderTest extends ProtocolDecoderTest {

    @Test
    public void testDecode() throws Exception {

        AtrackProtocolDecoder decoder = new AtrackProtocolDecoder(new AtrackProtocol());

        verifyNothing(decoder, binary(
                "fe0200014104d8f196820001"));

        verifyPositions(decoder, binary(
                "4050993f005c000200014104d8f19682525666c252568c3c52568c63ffc8338402698885000002000009cf03de0100000000000007d007d000525666c252568c5a52568c63ffc8338402698885000002000009cf03de0100000000000007d007d000"));

        verifyPositions(decoder, binary(
                "40501e58003301e000014104d8f19682525ecd5d525ee344525ee35effc88815026ab4d70000020000104403de01000b0000000007d007d000"));

        verifyPositions(decoder, binary(
                "40501e58003301e000014104d8f19682525ecd5d525ee344525ee35effc88815026ab4d70000020000104403de01000b0000000007d007d000000000000000"));

        // 7-byte date
        //verifyPosition(decoder, binary(
        //        "0203b494003c00eb00014104d8dd3a3e07de011b0b1f0307de011b0b1f0307de011b0b1f0300307f28030574d30000020000000600160100020000000007d007d000"));

        //verifyPosition(decoder, binary(
        //        "4050d2c500da055200014104d8f19682530755515307555053075581ffbba66a0231295c001902000000da000a0100830000000007d007d000000000001200080e090085530755605307555f53075582ffbbb04102313b4b001802000000e0000c0100850000000007d007d000000000001200080d0000865307556f5307556e53075582ffbbbbea02314b49002402000000e5000a01007b0000000007d007d000000000001200080d0200855307557e5307557d53075582ffbbc98702315982002502000000ea000901007a0000000007d007d000000000001300180d08007b"));
        
    }

}
