package X;

import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0qy  reason: invalid class name and case insensitive filesystem */
public class C15240qy implements C17060uE {
    public byte[] convertForegroundStateWithSubscriptionToThriftPayload(String str, Boolean bool, Integer num, List list, List list2) {
        return null;
    }

    public List getConnectSubscribeTopics(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SubscribeTopic subscribeTopic = (SubscribeTopic) it.next();
            if (C05270Sj.A01.get(subscribeTopic.A01) != null) {
                arrayList.add(subscribeTopic);
            }
        }
        return arrayList;
    }

    public int handleConnectMessage(DataOutputStream dataOutputStream, C14700py r15) {
        Long valueOf;
        C17320uh r7 = r15.A00;
        C17330ui r4 = (C17330ui) r15.A02;
        C17360ul r2 = (C17360ul) r15.A01;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        AnonymousClass0SE r8 = new AnonymousClass0SE(byteArrayOutputStream);
        C17340uj r3 = r2.A02;
        C17270uc r6 = new C17270uc(AnonymousClass006.A00);
        AnonymousClass0RP r1 = C17280ud.A0P;
        Long l = r3.A0B;
        Map map = r6.A01;
        map.put(r1, l);
        map.put(C17280ud.A0O, r3.A0I);
        map.put(C17280ud.A01, r3.A07);
        map.put(C17280ud.A09, r3.A09);
        map.put(C17280ud.A0L, Integer.valueOf(r3.A00));
        map.put(C17280ud.A0J, r3.A03);
        map.put(C17280ud.A0G, r3.A01);
        map.put(C17280ud.A07, r3.A0G);
        map.put(C17280ud.A0E, r3.A02);
        map.put(C17280ud.A0I, r3.A06);
        map.put(C17280ud.A0H, r3.A05);
        map.put(C17280ud.A03, r3.A0A);
        map.put(C17280ud.A02, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : r3.A0J) {
            Object obj2 = C05270Sj.A01.get(obj);
            if (obj2 != null) {
                arrayList.add(obj2);
            }
        }
        map.put(C17280ud.A0N, arrayList);
        map.put(C17280ud.A05, r3.A0D);
        AnonymousClass0RP r11 = C17280ud.A00;
        String str = r3.A0C;
        if (str == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(Long.parseLong(str));
        }
        map.put(r11, valueOf);
        map.put(C17280ud.A0K, (Object) null);
        map.put(C17280ud.A06, (Object) null);
        map.put(C17280ud.A0M, r3.A0F);
        map.put(C17280ud.A08, r3.A0H);
        map.put(C17280ud.A04, r3.A04);
        map.put(C17280ud.A0F, r3.A08);
        C17270uc r112 = new C17270uc(AnonymousClass006.A0Y);
        AnonymousClass0RP r12 = C17280ud.A0U;
        String str2 = r2.A03;
        Map map2 = r112.A01;
        map2.put(r12, str2);
        map2.put(C17280ud.A0d, r2.A06);
        map2.put(C17280ud.A0c, r2.A05);
        map2.put(C17280ud.A0V, r6);
        map2.put(C17280ud.A0Y, r2.A04);
        map2.put(C17280ud.A0X, (Object) null);
        map2.put(C17280ud.A0a, (Object) null);
        map2.put(C17280ud.A0W, (Object) null);
        map2.put(C17280ud.A0e, (Object) null);
        map2.put(C17280ud.A0T, r3.A0K);
        map2.put(C17280ud.A0b, (Object) null);
        String str3 = r2.A00;
        if (str3 != null) {
            C17270uc r32 = new C17270uc(AnonymousClass006.A0j);
            AnonymousClass0RP r0 = C17280ud.A0s;
            Map map3 = r32.A01;
            map3.put(r0, str3);
            map3.put(C17280ud.A0t, 0);
            map3.put(C17280ud.A0r, (Object) null);
            map2.put(C17280ud.A0Z, r32);
        }
        r112.A01(r8);
        byte[] A00 = C13340nT.A00(byteArrayOutputStream.toByteArray());
        int length = A00.length;
        int i = length + 12;
        dataOutputStream.writeByte(C17100uI.A00(r7));
        int A01 = 1 + C17100uI.A01(dataOutputStream, i);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(6);
        dataOutputStream.writeByte(77);
        dataOutputStream.writeByte(81);
        dataOutputStream.writeByte(84);
        dataOutputStream.writeByte(84);
        dataOutputStream.writeByte(111);
        dataOutputStream.writeByte(84);
        dataOutputStream.write(r4.A01);
        int i2 = 0;
        if (r4.A05) {
            i2 = 128;
        }
        if (r4.A04) {
            i2 |= 64;
        }
        if (r4.A07) {
            i2 |= 32;
        }
        int i3 = i2 | ((r4.A02 & 3) << 3);
        if (r4.A06) {
            i3 |= 4;
        }
        if (r4.A03) {
            i3 |= 2;
        }
        dataOutputStream.write(i3);
        dataOutputStream.writeShort(r4.A00);
        dataOutputStream.write(A00, 0, length);
        dataOutputStream.flush();
        return A01 + i;
    }
}
