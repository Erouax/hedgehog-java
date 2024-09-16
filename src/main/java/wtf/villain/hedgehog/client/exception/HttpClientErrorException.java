package wtf.villain.hedgehog.client.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.io.IOException;

@Getter
@RequiredArgsConstructor
public class HttpClientErrorException  extends IOException  {

	private final int statusCode;
	private final String message;
	private final String body;

}
