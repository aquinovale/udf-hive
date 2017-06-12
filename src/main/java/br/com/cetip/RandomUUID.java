package br.com.cetip;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;
import java.util.UUID;

public final class RandomUUID extends UDF
{
	public Text evaluate(){
		return new Text(UUID.randomUUID().toString());
	}
}
