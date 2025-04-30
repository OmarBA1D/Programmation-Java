/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_memcmp.c                                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ombouarg <marvin@42.fr>                    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/04/23 17:42:50 by ombouarg          #+#    #+#             */
/*   Updated: 2025/04/23 17:52:27 by ombouarg         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <string.h>
#include <stdio.h>

int	ft_memcmp(const void *s1, const void *s2, size_t n)
{
	const unsigned char	*p1;
	const unsigned char	*p2;

	p1 = s1;
	p2 = s2;
	while (n-- > 0)
	{
		if (*p1 != *p2)
			return (*p1 - *p2);
		p1++;
		p2++;
	}
	return (0);
}
/*
int	main(void)
{
	char	*s1 = "abc";
	char	*s2 = "abd";

	printf("Comparando 'abc' y 'abd' (2 bytes): %d\n", ft_memcmp(s1, s2, 2));
	printf("Comparando 'abc' y 'abd' (3 bytes): %d\n", ft_memcmp(s1, s2, 3));
	printf("Comparando 'abc' y 'abc': %d\n", ft_memcmp(s1, s1, 3));
	return (0);
}*/
