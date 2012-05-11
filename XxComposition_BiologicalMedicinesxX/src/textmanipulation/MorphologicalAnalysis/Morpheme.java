package textmanipulation.MorphologicalAnalysis;

/**
 * �`�ԑf�N���X
 * @author nabeta,okuya
 * @version 2.0
 */
public class Morpheme {
	public int STATEMENT_ID;				// ���ԍ�
	public int SEGMENT_ID;					// ���ߔԍ�
	public int MORPHEME_ID;					// �`�ԑf�ԍ�
	public String SURFACE_FORM;				// �\�w�`
	public String READING;					// �ǂ�
	public String PRONUNCIATION;			// ����
	public String BASE_FORM;				// ���`
	public String PART_OF_SPEECH;			// �i��
	public String PART_OF_SPEECH01;			// �i���ו���1
	public String PART_OF_SPEECH02;			// �i���ו���2
	public String PART_OF_SPEECH03;			// �i���ו���3
	public String CONJUGATION_TYPE;			// ���p�^
	public String CONJUGATION_FORM;			// ���p�`
//	public String PROPER_REPRESENTATION;	// �ŗL�\��

	//�o�̓t�H�[�}�b�g
	//�\�w�`\t�i��,�i���ו���1,�i���ו���2,�i���ו���3,���p�`,���p�^,���^,�ǂ�,����


	/**
	 * @param arg Cabocah�̏o�͌���
	 * @param statement_id ���ԍ�
	 * @param segment_id ���ߔԍ�
	 * @param morpheme_id �`�ԑf�ԍ�
	 */
	Morpheme(String arg)
	{
		String[] temp01 = arg.split("\t");
		if(temp01.length == 2){
			SURFACE_FORM = temp01[0];
			String[] temp02 = temp01[1].split(",");

			if(temp02.length == 9){
				PART_OF_SPEECH		= temp02[0];
				PART_OF_SPEECH01	= temp02[1];
				PART_OF_SPEECH02	= temp02[2];
				PART_OF_SPEECH03	= temp02[3];
				CONJUGATION_FORM	= temp02[4];
				CONJUGATION_TYPE	= temp02[5];
				BASE_FORM			= temp02[6];
				READING 			= temp02[7];
				PRONUNCIATION 		= temp02[8];

			}
			//�ȉ����m��p
			else if(temp02.length == 7){
				PART_OF_SPEECH		= temp02[0];
				PART_OF_SPEECH01	= temp02[1];
				PART_OF_SPEECH02	= temp02[2];
				PART_OF_SPEECH03	= temp02[3];
				CONJUGATION_FORM	= temp02[4];
				CONJUGATION_TYPE	= temp02[5];
				BASE_FORM			= temp02[6];
			}
		}
	}

	/**
	 * @param arg Cabocah�̏o�͌���
	 * @param statement_id ���ԍ�
	 * @param segment_id ���ߔԍ�
	 * @param morpheme_id �`�ԑf�ԍ�
	 */
	Morpheme(String arg, int statement_id, int segment_id, int morpheme_id)
	{
		STATEMENT_ID = statement_id;
		SEGMENT_ID = segment_id;
		MORPHEME_ID = morpheme_id;

		String[] temp01 = arg.split("\t");
		if(temp01.length == 3){
			SURFACE_FORM = temp01[0];
			String[] temp02 = temp01[1].split(",");

			if(temp02.length == 9){
				PART_OF_SPEECH		= temp02[0];
				PART_OF_SPEECH01	= temp02[1];
				PART_OF_SPEECH02	= temp02[2];
				PART_OF_SPEECH03	= temp02[3];
				CONJUGATION_FORM	= temp02[4];
				CONJUGATION_TYPE	= temp02[5];
				BASE_FORM			= temp02[6];
				READING 			= temp02[7];
				PRONUNCIATION 		= temp02[8];

			}
		}
	}
}
