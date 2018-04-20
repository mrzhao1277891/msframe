package com.ect.infrastructure.client.htttpClient.geckoClient;

import com.ect.infrastructure.client.htttpClient.geckoClient.dto.UnderWrittingRequestDto;
import com.ect.infrastructure.client.htttpClient.geckoClient.dto.UnderWrittingResponseDto;
import org.springframework.stereotype.Service;

/**
 * Created by zhaojun on 2018/3/21.
 * 请求壁虎的核保服务
 */
@Service
public interface UnderWrittingClient {
    UnderWrittingResponseDto underWrittingGec(UnderWrittingRequestDto underWrittingRequestDto);
}
