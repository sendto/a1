with t as (select '1234567890123456' I002_NUMBER from dual union all select '100234567890123456' I002_NUMBER from dual )
select I002_NUMBER, substr(I002_NUMBER,1,15) || case when ROUND( 
                                                                (case when substr(I002_NUMBER,15,1)*2 > 9 then substr(I002_NUMBER,15,1)*2 -9 else substr(I002_NUMBER,15,1)*2  end + 
                                                                substr(I002_NUMBER,14,1) + case when substr(I002_NUMBER,13,1)*2 > 9 then substr(I002_NUMBER,13,1)*2 -9 else substr(I002_NUMBER,13,1)*2  end + 
                                                                substr(I002_NUMBER,12,1) + case when substr(I002_NUMBER,11,1)*2 > 9 then substr(I002_NUMBER,11,1)*2 -9 else substr(I002_NUMBER,11,1)*2  end + 
                                                                substr(I002_NUMBER,10,1) + case when substr(I002_NUMBER,9,1)*2 > 9 then substr(I002_NUMBER,9,1)*2 -9 else substr(I002_NUMBER,9,1)*2  end + 
                                                                substr(I002_NUMBER,8,1) + case when substr(I002_NUMBER,7,1)*2 > 9 then substr(I002_NUMBER,7,1)*2 -9 else substr(I002_NUMBER,7,1)*2  end + 
                                                                substr(I002_NUMBER,6,1) + case when substr(I002_NUMBER,5,1)*2 > 9 then substr(I002_NUMBER,5,1)*2 -9 else substr(I002_NUMBER,5,1)*2  end + 
                                                                substr(I002_NUMBER,4,1) + case when substr(I002_NUMBER,3,1)*2 > 9 then substr(I002_NUMBER,3,1)*2 -9 else substr(I002_NUMBER,3,1)*2  end + 
                                                                substr(I002_NUMBER,2,1) + case when substr(I002_NUMBER,1,1)*2 > 9 then substr(I002_NUMBER,1,1)*2 -9 else substr(I002_NUMBER,1,1)*2  end) 
                                                                + 5, -1) - 
                                                                (case when substr(I002_NUMBER,15,1)*2 > 9 then substr(I002_NUMBER,15,1)*2 -9 else substr(I002_NUMBER,15,1)*2  end + 
                                                                substr(I002_NUMBER,14,1) + case when substr(I002_NUMBER,13,1)*2 > 9 then substr(I002_NUMBER,13,1)*2 -9 else substr(I002_NUMBER,13,1)*2  end + 
                                                                substr(I002_NUMBER,12,1) + case when substr(I002_NUMBER,11,1)*2 > 9 then substr(I002_NUMBER,11,1)*2 -9 else substr(I002_NUMBER,11,1)*2  end + 
                                                                substr(I002_NUMBER,10,1) + case when substr(I002_NUMBER,9,1)*2 > 9 then substr(I002_NUMBER,9,1)*2 -9 else substr(I002_NUMBER,9,1)*2  end + 
                                                                substr(I002_NUMBER,8,1) + case when substr(I002_NUMBER,7,1)*2 > 9 then substr(I002_NUMBER,7,1)*2 -9 else substr(I002_NUMBER,7,1)*2  end + 
                                                                substr(I002_NUMBER,6,1) + case when substr(I002_NUMBER,5,1)*2 > 9 then substr(I002_NUMBER,5,1)*2 -9 else substr(I002_NUMBER,5,1)*2  end + 
                                                                substr(I002_NUMBER,4,1) + case when substr(I002_NUMBER,3,1)*2 > 9 then substr(I002_NUMBER,3,1)*2 -9 else substr(I002_NUMBER,3,1)*2  end + 
                                                                substr(I002_NUMBER,2,1) + case when substr(I002_NUMBER,1,1)*2 > 9 then substr(I002_NUMBER,1,1)*2 -9 else substr(I002_NUMBER,1,1)*2  end)   
                                                                = 10 then 0 else ROUND( 
                                                                (case when substr(I002_NUMBER,15,1)*2 > 9 then substr(I002_NUMBER,15,1)*2 -9 else substr(I002_NUMBER,15,1)*2  end + 
                                                                substr(I002_NUMBER,14,1) + case when substr(I002_NUMBER,13,1)*2 > 9 then substr(I002_NUMBER,13,1)*2 -9 else substr(I002_NUMBER,13,1)*2  end + 
                                                                substr(I002_NUMBER,12,1) + case when substr(I002_NUMBER,11,1)*2 > 9 then substr(I002_NUMBER,11,1)*2 -9 else substr(I002_NUMBER,11,1)*2  end + 
                                                                substr(I002_NUMBER,10,1) + case when substr(I002_NUMBER,9,1)*2 > 9 then substr(I002_NUMBER,9,1)*2 -9 else substr(I002_NUMBER,9,1)*2  end + 
                                                                substr(I002_NUMBER,8,1) + case when substr(I002_NUMBER,7,1)*2 > 9 then substr(I002_NUMBER,7,1)*2 -9 else substr(I002_NUMBER,7,1)*2  end + 
                                                                substr(I002_NUMBER,6,1) + case when substr(I002_NUMBER,5,1)*2 > 9 then substr(I002_NUMBER,5,1)*2 -9 else substr(I002_NUMBER,5,1)*2  end + 
                                                                substr(I002_NUMBER,4,1) + case when substr(I002_NUMBER,3,1)*2 > 9 then substr(I002_NUMBER,3,1)*2 -9 else substr(I002_NUMBER,3,1)*2  end + 
                                                                substr(I002_NUMBER,2,1) + case when substr(I002_NUMBER,1,1)*2 > 9 then substr(I002_NUMBER,1,1)*2 -9 else substr(I002_NUMBER,1,1)*2  end) 
                                                                + 5, -1) - 
                                                                (case when substr(I002_NUMBER,15,1)*2 > 9 then substr(I002_NUMBER,15,1)*2 -9 else substr(I002_NUMBER,15,1)*2  end + 
                                                                substr(I002_NUMBER,14,1) + case when substr(I002_NUMBER,13,1)*2 > 9 then substr(I002_NUMBER,13,1)*2 -9 else substr(I002_NUMBER,13,1)*2  end + 
                                                                substr(I002_NUMBER,12,1) + case when substr(I002_NUMBER,11,1)*2 > 9 then substr(I002_NUMBER,11,1)*2 -9 else substr(I002_NUMBER,11,1)*2  end + 
                                                                substr(I002_NUMBER,10,1) + case when substr(I002_NUMBER,9,1)*2 > 9 then substr(I002_NUMBER,9,1)*2 -9 else substr(I002_NUMBER,9,1)*2  end + 
                                                                substr(I002_NUMBER,8,1) + case when substr(I002_NUMBER,7,1)*2 > 9 then substr(I002_NUMBER,7,1)*2 -9 else substr(I002_NUMBER,7,1)*2  end + 
                                                                substr(I002_NUMBER,6,1) + case when substr(I002_NUMBER,5,1)*2 > 9 then substr(I002_NUMBER,5,1)*2 -9 else substr(I002_NUMBER,5,1)*2  end + 
                                                                substr(I002_NUMBER,4,1) + case when substr(I002_NUMBER,3,1)*2 > 9 then substr(I002_NUMBER,3,1)*2 -9 else substr(I002_NUMBER,3,1)*2  end + 
                                                                substr(I002_NUMBER,2,1) + case when substr(I002_NUMBER,1,1)*2 > 9 then substr(I002_NUMBER,1,1)*2 -9 else substr(I002_NUMBER,1,1)*2  end) 
                                                                end chk_num
from t where REGEXP_LIKE(I002_NUMBER, '(\D|^)\d{16}(\D|$)');
