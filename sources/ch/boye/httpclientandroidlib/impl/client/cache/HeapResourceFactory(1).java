package ch.boye.httpclientandroidlib.impl.client.cache;

import ch.boye.httpclientandroidlib.client.cache.InputLimit;
import ch.boye.httpclientandroidlib.client.cache.Resource;
import ch.boye.httpclientandroidlib.client.cache.ResourceFactory;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class HeapResourceFactory implements ResourceFactory {
    public Resource copy(String str, Resource resource) {
        byte[] byteArray;
        if (resource instanceof HeapResource) {
            byteArray = ((HeapResource) resource).b;
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            IOUtils.copyAndClose(resource.getInputStream(), byteArrayOutputStream);
            byteArray = byteArrayOutputStream.toByteArray();
        }
        return new HeapResource(byteArray);
    }

    public Resource generate(String str, InputStream inputStream, InputLimit inputLimit) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
            j += (long) read;
            if (inputLimit != null && j > inputLimit.value) {
                inputLimit.reached = true;
                break;
            }
        }
        return new HeapResource(byteArrayOutputStream.toByteArray());
    }
}
