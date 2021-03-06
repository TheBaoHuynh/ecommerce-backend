package com.baoht.ecommercebackend.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestProductPage {

    private String categoryId;
    private String keyword;
    private String sortByColumn;
    private String sortBy;
    private String status;
    private int pageNumber;
    private int itemPerPage;

}
