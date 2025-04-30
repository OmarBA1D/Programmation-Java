/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_bzero.c                                         :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ombouarg <marvin@42.fr>                    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/04/21 17:57:40 by ombouarg          #+#    #+#             */
/*   Updated: 2025/04/22 15:06:37 by ombouarg         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <strings.h>
#include <stdio.h>

void	ft_bzero(void *s, size_t n)
{
	unsigned char	*ptr;

	ptr = (unsigned char *) s;
	while (n-- > 0)
	{
		*ptr++ = 0;
	}
}

/*
int	main(void)
{
	char	str1[20];
	char	str2[20];
	int		arr1[5];
	int		arr2[5];
	size_t	i;

	i = 0;
	while (i < 20)
	{
		str1[i] = "Hola, mundo!"[i];
		str2[i] = "Hola, mundo!"[i];
		i++;
	}
	i = 0;
	while (i < 5)
	{
		arr1[i] = i + 1;
		arr2[i] = i + 1;
		i++;
	}
	printf("Antes de ft_bzero (str1): %s\n", str1);
	ft_bzero(str1, 5);
	printf("Después de ft_bzero (str1): ");
	i = 0;
	while (i < sizeof(str1))
	{
		printf("%d ", str1[i]);
		i++;
	}
	printf("\n");
	printf("Antes de bzero (str2): %s\n", str2);
	bzero(str2, 5);
	printf("Después de bzero (str2): ");
	i = 0;
	while (i < sizeof(str2))
	{
		printf("%d ", str2[i]);
		i++;
	}
	printf("\n\n");
	printf("Antes de ft_bzero (arr1): ");
	i = 0;
	while (i < 5)
	{
		printf("%d ", arr1[i]);
		i++;
	}
	printf("\n");
	ft_bzero(arr1, 3 * sizeof(int));
	printf("Después de ft_bzero (arr1): ");
	i = 0;
	while (i < 5)
	{
		printf("%d ", arr1[i]);
		i++;
	}
	printf("\n");
	printf("Antes de bzero (arr2): ");
	i = 0;
	while (i < 5)
	{
		printf("%d ", arr2[i]);
		i++;
	}
	printf("\n");
	bzero(arr2, 3 * sizeof(int));
	printf("Después de bzero (arr2): ");
	i = 0;
	while (i < 5)
	{
		printf("%d ", arr2[i]);
		i++;
	}
	printf("\n");
	return (0);
}*/
