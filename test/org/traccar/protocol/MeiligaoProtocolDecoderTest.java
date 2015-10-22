package org.traccar.protocol;

import org.jboss.netty.buffer.ChannelBuffers;
import org.junit.Test;
import org.traccar.ProtocolDecoderTest;
import org.traccar.helper.ChannelBufferTools;

public class MeiligaoProtocolDecoderTest extends ProtocolDecoderTest {

    @Test
    public void testDecode() throws Exception {

        MeiligaoProtocolDecoder decoder = new MeiligaoProtocolDecoder(new MeiligaoProtocol());

        verifyPosition(decoder, binary(
                "242400706796502079108999553131333131382e3030302c412c313033372e393637382c4e2c30363132312e353637392c572c302e35342c322e34322c3330303931352c2c2c412a37307c302e37377c392e397c303030307c303030302c303161327c3030313138373132374cae0d0a"));

        verifyPosition(decoder, binary(
                "24240074630700194707719966009E1F7F00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000007C3132303334302C3238303630362C323430302E303030302C4E2C31323130302E303030302C458F7E0D0A"));

        verifyPosition(decoder, binary(
                "24240076220720151fffff99660012b3ab00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000007c3135303634382c3233303731352c313931352e37323835362c4e2c30373235322e35333034342c456dd00d0a"));

        verifyNothing(decoder, binary(
                "24240000123456FFFFFFFF50008B9B0D0A"));

        verifyNothing(decoder, binary(
                "24240011300600000046090002849a0d0a"));
        
        verifyPosition(decoder, binary(
                "242400722015032700004299553134313131352e3030302c412c353031312e343335342c4e2c30303834332e373039322c452c3030302e302c3034342e362c3134303431352c2c2c412a36437c322e317c39392e347c303030307c303030302c303030307c3030303032343730350e480d0a"));
        
        verifyPosition(decoder, binary(
                "2424006e241120141fffff99553039333931302e30302c412c313931342e37373736352c4e2c30373235302e36383037322c452c302e3035312c2c3230313231342c2c2c442a37357c302e38327c322e387c303030307c303030302c303030307c3031303833373433311d170d0a"));

        verifyPosition(decoder, binary(
                "24240000123456FFFFFFFF99553033353634342E3030302C412C323233322E363038332C4E2C31313430342E383133372C452C302E30302C2C3031303830392C2C2A31437C31312E357C3139347C303030307C303030302C3030303069620D0A"));

        verifyPosition(decoder, binary(
                "242400003358019703581F99553133343335312E3030302C412C303932352E353032352C4E2C30363931342E383130372C572C302E30302C32332C3330313031322C2C2A32437C302E387C3138367C323030307C303132362C303046467C303244453030303244384344423431357C30367C303046443642373995820D0A"));

        verifyPosition(decoder, binary(
                "242400001691000484124F99553134303630332E3030302C412C303933342E323535342C4E2C30363931332E303936362C572C302E30302C2C3330313031322C2C2A30327C302E387C3230377C30303030FA420D0A"));

        verifyPosition(decoder, binary(
                "2424000045124220306FFF9999143135353432322E3030302C562C323233302E373632332C4E2C31313430332E343231382C452C302E30302C302C3036303231312C2C2A31417C302E307C32367C303030307C303030302C303030307C303030303030303030303030303030307C36337C3030303030303030BAC10D0A"));

        verifyPosition(decoder, binary(
                "242400008621700142458F9999503139323935382E3030302C412C333632372E313639392C4E2C30313034332E353632372C452C302E30302C3233392C3039313231322C2C2A30467C312E307C377C303030307C303141392C303139377C303235443030303230303541383639467C31327C3030303333424233E2480D0A"));

        verifyPosition(decoder, binary(
                "24240000123456789FFFFF99553032303630302E3933302C412C323330392E323035312C4E2C31313331382E383434392C452C302E30302C302E30302C3039303731302C2C2C412A36417C322E367C39362E377C303030307C303030302C334646467C303030303030303030C4520D0A"));
        
        verifyPosition(decoder, binary(
                "242400005977203744058499553032303131372E3030302C412C343131372E393231322C4E2C30383133302E323039362C572C302E30302C3330332E38352C3236303231337C312E367C30307C303030307C303030302C3030303071CD0D0A"));

        verifyPosition(decoder, binary(
                "242400003511111111111199553133343734332e3030332c412c303634382e393836362c532c31303730372e353739352c452c3030302e302c3030302e302c323630333133f3150d0a"));

        verifyPosition(decoder, binary(
                "242400000091800369764199553038353133302e3030302c412c333035332e313634352c4e2c30373535352e373437362c452c302e30302c32372c3136303431332c2c2a33467c302e387c3234357c323030307c303346372c303030302c303030302c303031422c303030302c303030302c303030302c303030307c303139343030303230314343363237437c31417c3031313630383439e6a70d0a"));
        
        verifyPosition(decoder, binary(
                "2424000026016100901fff99553136353835332c412c343130392e36303231322c4e2c3833382e35393131392c572c332e3838332c31322e30302c3034303731332c2c2a34467c322e357c3131307c000600007c0000010f7c303242302c3042333697740d0a"));

        verifyNothing(decoder, binary(
                "2424000067622010053562aa0000010001ae4f00000007800000003039353135362e3030302c412c323632332e383936362c4e2c30353030352e303638302c452c32342e352c3234312e302c323231303133599c0d0a"));

        verifyPosition(decoder, binary(
                "242400001007ffffffffff99553136323330392e3035342c562c303933312e393136332c4e2c30363931312e383233332c572c2c2c3235313131332c2c2c4e2a36437c7c3135387c303030309cc60d0a"));

        //verifyPosition(decoder, binary(
        //        "242400003563070435652099553035323034322e3030302c412c343435382e333536352c4e2c30343130342e343831332c452c302e30302c302e30302c3139303131342c2c2a39437c302e3730303030307c2d3835393131373337367c303130307c307c7c7c4f2a0d0a"));
        
        verifyPosition(decoder, binary(
                "2424005035784251ffffff99553030303033362e3938312c562c303933312e333437312c4e2c30363931312e383431322c572c2c2c3238303131342c2c2c4e2a36357c7c3136387c323030305e420d0a"));

        verifyPosition(decoder, binary(
                "2424007811223344ffffff99553031303735372e3030302c412c323935392e313337342c4e2c30393534302e333238342c572c3030302e302c3038382e372c3234303631342c2c2c412a37397c312e347c33352e317c303030307c303030312c303030307c3030303030333732337c3030303030e39f0d0a"));

        verifyPosition(decoder, binary(
                "2424007f3568960306760199553131303932342e3030302c412c343533342e323538352c4e2c30313933382e363531342c452c302e30302c2c3237303731342c2c2c412a37317c312e377c3130307c383030307c303737422c303030302c303030302c303030302c303030302c303030302c303030302c303030305dfc0d0a"));
        
        verifyPosition(decoder, binary(
                "2424007f2015603256ffff99553230303230392e30302c412c313734342e36393434382c4e2c30383331392e30353537302c452c31302e3236322c3234382e35352c3236303631352c2c2c442a35437c302e39397c33312e397c303830317c303030302c303030637c3030303933303131367c3030376165313035d5550d0a"));

    }

}
