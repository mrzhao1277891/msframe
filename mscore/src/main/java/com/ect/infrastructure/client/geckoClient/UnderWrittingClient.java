package com.ect.infrastructure.client.geckoClient;

import com.ect.infrastructure.client.geckoClient.dto.UnderWrittingRequestDto;
import com.ect.infrastructure.client.geckoClient.dto.UnderWrittingResponseDto;

/**
 * Created by zhaojun on 2018/3/21.
 * 请求壁虎的核保服务
 */
public interface UnderWrittingClient {
    UnderWrittingResponseDto underWrittingGec(UnderWrittingRequestDto underWrittingRequestDto);
}
